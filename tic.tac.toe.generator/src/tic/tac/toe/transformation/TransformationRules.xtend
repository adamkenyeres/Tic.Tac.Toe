package tic.tac.toe.transformation

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import org.eclipse.emf.ecore.resource.Resource
import tictactoe.TictactoeFactory
import queries.util.XWinningQuerySpecification
import queries.XWinningMatch
import queries.XWinningMatcher
import tictactoe.Color
import javax.xml.bind.Marshaller.Listener
import tictactoe.Engine
import tictactoe.Square
import queries.util.XMovesQuerySpecification
import queries.XMovesMatch
import queries.XMovesMatcher
import queries.OMovesMatch
import queries.OMovesMatcher
import queries.util.OMovesQuerySpecification
import queries.OWinningMatch
import queries.OWinningMatcher
import queries.util.OWinningQuerySpecification
import queries.XForkMatch
import queries.XForkMatcher
import queries.util.OForkQuerySpecification
import queries.OForkMatcher
import queries.OForkMatch
import queries.util.XForkQuerySpecification
import queries.OTwoMovesFromWinningMatch
import queries.OTwoMovesFromWinningMatcher
import queries.util.OTwoMovesFromWinningQuerySpecification
import queries.PreventXForkByForcingWinMatch
import queries.PreventXForkByForcingWinMatcher
import queries.util.PreventXForkByForcingWinQuerySpecification
import queries.MarkCenterMatch
import queries.MarkCenterMatcher
import queries.util.MarkCenterQuerySpecification
import queries.OppositeXCornerMatch
import queries.OppositeXCornerMatcher
import queries.util.OppositeXCornerQuerySpecification
import queries.EmptySidesMatch
import queries.EmptySidesMatcher
import queries.util.EmptySidesQuerySpecification
import tic.tac.toe.generator.BoardVisualizer

class TransformationRules {

	def executeRule(Engine eng, Square square) {
		var factory = TictactoeFactory.eINSTANCE
		var mark = factory.createMark
		mark.color = Color.WHITE
		mark.pos_x = square.pos_x
		mark.pos_y = square.pos_y
		eng.whitePlayer.marks.add(
			mark)
	}

	/* Transformation-related extensions */
	extension BatchTransformation transformation
	extension BatchTransformationStatements statements

	/* Transformation rule-related extensions */
	extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
	extension IModelManipulations manipulation
	protected Boolean isFirstMove = true;
	protected ViatraQueryEngine engine
	protected Resource resource
	protected Engine tictactoeEngine
	protected BoardVisualizer board
	// protected BatchTransformationRule<?,?> exampleRule
	public BatchTransformationRule<OWinningMatch, OWinningMatcher> oWinningRule
	public BatchTransformationRule<XWinningMatch, XWinningMatcher> xWinningPreventionRule
	public BatchTransformationRule<XMovesMatch, XMovesMatcher> xMovesRule
	public BatchTransformationRule<XMovesMatch, XMovesMatcher> xMovesForLoading
	public BatchTransformationRule<OMovesMatch, OMovesMatcher> oMovesRule
	public BatchTransformationRule<XForkMatch, XForkMatcher> xForkPreventionRule
	public BatchTransformationRule<OForkMatch, OForkMatcher> oForkRule
	public BatchTransformationRule<OTwoMovesFromWinningMatch, OTwoMovesFromWinningMatcher> oForceWinRule
	public BatchTransformationRule<PreventXForkByForcingWinMatch, PreventXForkByForcingWinMatcher> xForkPreventionByForcingWin
	public BatchTransformationRule<MarkCenterMatch, MarkCenterMatcher> markCenter
	public BatchTransformationRule<OppositeXCornerMatch, OppositeXCornerMatcher> oppositeCorner
	public BatchTransformationRule<EmptySidesMatch, EmptySidesMatcher> emptySides

	new(Resource resource, Engine eng, BoardVisualizer board) {
		this.tictactoeEngine = eng
		this.resource = resource
		this.board = board
		// Create EMF scope and EMF IncQuery engine based on the resource
		val scope = new EMFScope(resource)
		engine = ViatraQueryEngine.on(scope);

		try {
			oWinningRule = createRule.name("oWinningRule").precondition(OWinningQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build
			xWinningPreventionRule = createRule.name("xWinningPreventionRule").precondition(
				XWinningQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build

			xMovesRule = createRule.name("XMoves").precondition(XMovesQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.BLACK
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.blackPlayer.marks.add(mark)
				
			].build

			oMovesRule = createRule.name("OMoves").precondition(OMovesQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build
			oForkRule = createRule.name("OForkRule").precondition(OForkQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build

			xForkPreventionRule = createRule.name("XForkPreventionRule").precondition(
				XForkQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build
			oForceWinRule = createRule.name("OForceWinRule").precondition(
				OTwoMovesFromWinningQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build
			xForkPreventionByForcingWin = createRule.name("XForkPreventionByForcingWin").precondition(
				PreventXForkByForcingWinQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build
			markCenter = createRule.name("MarkCenter").precondition(MarkCenterQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build
			oppositeCorner = createRule.name("OppositeCorner").precondition(
				OppositeXCornerQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build
			emptySides = createRule.name("EmptySides").precondition(EmptySidesQuerySpecification.instance()).action [
				var factory = TictactoeFactory.eINSTANCE
				var mark = factory.createMark
				mark.color = Color.WHITE
				mark.pos_x = square.pos_x
				mark.pos_y = square.pos_y
				eng.whitePlayer.marks.add(mark)
			].build
			xMovesForLoading = createRule.name("XMovesForLoading").precondition(XMovesQuerySpecification.instance()).action [
			].build
		} catch (Exception e) {
		}
		createTransformation

	}

	public def execute(Square square, Engine eng) {
//      Fire the defined rules here
//      exampleRule.fireAllCurrent
		try {
			if(isFirstMove){
				xMovesForLoading.fireOne
				isFirstMove = !isFirstMove
			}
			if (!eng.isOTurn) {
				xMovesRule.fireOne(new Pair("square", square))
				eng.isOTurn = !eng.isOTurn
			}
			if (eng.isOTurn) {
				try {
					oWinningRule.fireOne
					eng.isOTurn = !eng.isOTurn
					return
				} catch (Exception e) {
				}
				try {
					xWinningPreventionRule.fireOne
					eng.isOTurn = !eng.isOTurn
					return
				} catch (Exception e) {
				}
				try {
					oForkRule.fireOne
					eng.isOTurn = !eng.isOTurn
					return
				} catch (Exception e) {
				}
				try {
					xForkPreventionByForcingWin.fireOne
					eng.isOTurn = !eng.isOTurn
					return;
				} catch (Exception e) {
				}
				try {
					xForkPreventionRule.fireOne
					eng.isOTurn = !eng.isOTurn
					return
				} catch (Exception e) {
				}
				try {
					markCenter.fireOne
					eng.isOTurn = !eng.isOTurn
					return;
				} catch (Exception e) {
				}
				try {
					oppositeCorner.fireOne
					eng.isOTurn = !eng.isOTurn
					return;
				} catch (Exception e) {
				}
				try {
					emptySides.fireOne
					eng.isOTurn = !eng.isOTurn
					return;
				} catch (Exception e) {
				}
				try {
					oMovesRule.fireOne
					eng.isOTurn = !eng.isOTurn
					return
				} catch (Exception e) {
				}

				eng.isOTurn = !eng.isOTurn
			}

		} catch (Exception e) {
		}
	}

	private def createTransformation() {
		// Create VIATRA model manipulations
		this.manipulation = new SimpleModelManipulations(engine)
		// Create VIATRA Batch transformation
		transformation = BatchTransformation.forEngine(engine).build
		// Initialize batch transformation statements
		statements = transformation.transformationStatements
	}

//  private def getExampleRule() {
//      if(exampleRule == null){
//          exampleRule = createRule.name("ExampleRule").precondition(ExampleMatcher.querySpecification).action [
//              Do Rule Actions here
//          ].build
//      }
//      return exampleRule
//  }
	def dispose() {
		if (transformation != null) {
			transformation.ruleEngine.dispose
		}
		transformation = null
		return
	}
}
