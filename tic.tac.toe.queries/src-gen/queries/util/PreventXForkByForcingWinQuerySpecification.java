/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TwoMovesFromWinning.vql
 */
package queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import queries.PreventXForkByForcingWinMatch;
import queries.PreventXForkByForcingWinMatcher;
import queries.util.CornersQuerySpecification;
import queries.util.ForceOWinQuerySpecification;
import queries.util.MarkOnSquareQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate PreventXForkByForcingWinMatcher in a type-safe way.
 * 
 * @see PreventXForkByForcingWinMatcher
 * @see PreventXForkByForcingWinMatch
 * 
 */
@SuppressWarnings("all")
public final class PreventXForkByForcingWinQuerySpecification extends BaseGeneratedEMFQuerySpecification<PreventXForkByForcingWinMatcher> {
  private PreventXForkByForcingWinQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static PreventXForkByForcingWinQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PreventXForkByForcingWinMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PreventXForkByForcingWinMatcher.on(engine);
  }
  
  @Override
  public PreventXForkByForcingWinMatcher instantiate() throws ViatraQueryException {
    return PreventXForkByForcingWinMatcher.create();
  }
  
  @Override
  public PreventXForkByForcingWinMatch newEmptyMatch() {
    return PreventXForkByForcingWinMatch.newEmptyMatch();
  }
  
  @Override
  public PreventXForkByForcingWinMatch newMatch(final Object... parameters) {
    return PreventXForkByForcingWinMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Engine) parameters[1], (tictactoe.Color) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link PreventXForkByForcingWinQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link PreventXForkByForcingWinQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static PreventXForkByForcingWinQuerySpecification INSTANCE = new PreventXForkByForcingWinQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PreventXForkByForcingWinQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSquare = new PParameter("square", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEngine = new PParameter("engine", "tictactoe.Engine", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Engine")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pColor = new PParameter("color", "tictactoe.Color", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://example.com/tictactoe", "Color")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSquare, parameter_pEngine, parameter_pColor);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.preventXForkByForcingWin";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("square","engine","color");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, Collections.<String,Object>emptyMap()));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_engine = body.getOrCreateVariableByName("engine");
      		PVariable var_color = body.getOrCreateVariableByName("color");
      		PVariable var_squareCorner1 = body.getOrCreateVariableByName("squareCorner1");
      		PVariable var_squareCorner2 = body.getOrCreateVariableByName("squareCorner2");
      		PVariable var_pos1_x = body.getOrCreateVariableByName("pos1_x");
      		PVariable var_pos2_x = body.getOrCreateVariableByName("pos2_x");
      		PVariable var_pos2_y = body.getOrCreateVariableByName("pos2_y");
      		PVariable var_pos1_y = body.getOrCreateVariableByName("pos1_y");
      		PVariable var_markCorner1 = body.getOrCreateVariableByName("markCorner1");
      		PVariable var_markCorner2 = body.getOrCreateVariableByName("markCorner2");
      		PVariable var_black = body.getOrCreateVariableByName("black");
      		PVariable var_colorX = body.getOrCreateVariableByName("colorX");
      		PVariable var_markCenter = body.getOrCreateVariableByName("markCenter");
      		PVariable var_squareCenter = body.getOrCreateVariableByName("squareCenter");
      		PVariable var_posCenter_x = body.getOrCreateVariableByName("posCenter_x");
      		PVariable var_posCenter_y = body.getOrCreateVariableByName("posCenter_y");
      		PVariable var_white = body.getOrCreateVariableByName("white");
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		new TypeConstraint(body, new FlatTuple(var_color), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://example.com/tictactoe", "Color")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_square, parameter_pSquare),
      		   new ExportedParameter(body, var_engine, parameter_pEngine),
      		   new ExportedParameter(body, var_color, parameter_pColor)
      		));
      		// 	find corners(squareCorner1, engine)
      		new PositivePatternCall(body, new FlatTuple(var_squareCorner1, var_engine), CornersQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find corners(squareCorner2, engine)
      		new PositivePatternCall(body, new FlatTuple(var_squareCorner2, var_engine), CornersQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Square.pos_x(squareCorner1, pos1_x)
      		new TypeConstraint(body, new FlatTuple(var_squareCorner1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_squareCorner1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_0_, var_pos1_x);
      		// 	Square.pos_x(squareCorner2, pos2_x)
      		new TypeConstraint(body, new FlatTuple(var_squareCorner2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_squareCorner2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_1_, var_pos2_x);
      		// 	Square.pos_y(squareCorner2, pos2_y)
      		new TypeConstraint(body, new FlatTuple(var_squareCorner2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_squareCorner2, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_2_, var_pos2_y);
      		// 	Square.pos_y(squareCorner1, pos1_y)
      		new TypeConstraint(body, new FlatTuple(var_squareCorner1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_squareCorner1, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_3_, var_pos1_y);
      		// 	//Oposite Corners	check((pos1_x == pos2_x * - 1)	&&(pos1_y == pos2_y * - 1))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern preventXForkByForcingWin";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("pos1_x", "pos1_y", "pos2_x", "pos2_y");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer pos1_x = (Integer) provider.getValue("pos1_x");
      		        Integer pos1_y = (Integer) provider.getValue("pos1_y");
      		        Integer pos2_x = (Integer) provider.getValue("pos2_x");
      		        Integer pos2_y = (Integer) provider.getValue("pos2_y");
      		        return evaluateExpression_1_1(pos1_x, pos1_y, pos2_x, pos2_y);
      		    }
      		},  null); 
      		// 	find markOnSquare(markCorner1, squareCorner1, engine)
      		new PositivePatternCall(body, new FlatTuple(var_markCorner1, var_squareCorner1, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find markOnSquare(markCorner2, squareCorner2, engine)
      		new PositivePatternCall(body, new FlatTuple(var_markCorner2, var_squareCorner2, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Engine.blackPlayer(engine, black)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "blackPlayer")));
      		new Equality(body, var__virtual_4_, var_black);
      		// 	Player.marks(black, markCorner1)
      		new TypeConstraint(body, new FlatTuple(var_black), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_black, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_5_, var_markCorner1);
      		// 	Mark.color(markCorner1, colorX)
      		new TypeConstraint(body, new FlatTuple(var_markCorner1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_markCorner1, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_6_, var_colorX);
      		// 	Mark.color(markCorner2, colorX)
      		new TypeConstraint(body, new FlatTuple(var_markCorner2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var_markCorner2, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_7_, var_colorX);
      		// 	find markOnSquare(markCenter, squareCenter, engine)
      		new PositivePatternCall(body, new FlatTuple(var_markCenter, var_squareCenter, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Square.pos_x(squareCenter, posCenter_x)
      		new TypeConstraint(body, new FlatTuple(var_squareCenter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var_squareCenter, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_8_, var_posCenter_x);
      		// 	Square.pos_y(squareCenter, posCenter_y)
      		new TypeConstraint(body, new FlatTuple(var_squareCenter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var_squareCenter, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_9_, var_posCenter_y);
      		// 	check(posCenter_x == 0 && posCenter_y == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern preventXForkByForcingWin";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("posCenter_x", "posCenter_y");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer posCenter_x = (Integer) provider.getValue("posCenter_x");
      		        Integer posCenter_y = (Integer) provider.getValue("posCenter_y");
      		        return evaluateExpression_1_2(posCenter_x, posCenter_y);
      		    }
      		},  null); 
      		// 	Engine.whitePlayer(engine, white)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "whitePlayer")));
      		new Equality(body, var__virtual_10_, var_white);
      		// 	Player.marks(white, markCenter)
      		new TypeConstraint(body, new FlatTuple(var_white), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var_white, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_11_, var_markCenter);
      		// 	find forceOWin(square, engine, color)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_engine, var_color), ForceOWinQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer pos1_x, final Integer pos1_y, final Integer pos2_x, final Integer pos2_y) {
    return (((pos1_x).intValue() == ((pos2_x).intValue() * (-1))) && ((pos1_y).intValue() == ((pos2_y).intValue() * (-1))));
  }
  
  private static boolean evaluateExpression_1_2(final Integer posCenter_x, final Integer posCenter_y) {
    return (((posCenter_x).intValue() == 0) && ((posCenter_y).intValue() == 0));
  }
}
