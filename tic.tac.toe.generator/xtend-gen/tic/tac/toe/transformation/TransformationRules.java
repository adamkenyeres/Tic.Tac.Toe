package tic.tac.toe.transformation;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.transformation.evm.api.RuleEngine;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import queries.EmptySidesMatch;
import queries.EmptySidesMatcher;
import queries.MarkCenterMatch;
import queries.MarkCenterMatcher;
import queries.OForkMatch;
import queries.OForkMatcher;
import queries.OMovesMatch;
import queries.OMovesMatcher;
import queries.OTwoMovesFromWinningMatch;
import queries.OTwoMovesFromWinningMatcher;
import queries.OWinningMatch;
import queries.OWinningMatcher;
import queries.OppositeXCornerMatch;
import queries.OppositeXCornerMatcher;
import queries.PreventXForkByForcingWinMatch;
import queries.PreventXForkByForcingWinMatcher;
import queries.XForkMatch;
import queries.XForkMatcher;
import queries.XMovesMatch;
import queries.XMovesMatcher;
import queries.XWinningMatch;
import queries.XWinningMatcher;
import queries.util.EmptySidesQuerySpecification;
import queries.util.MarkCenterQuerySpecification;
import queries.util.OForkQuerySpecification;
import queries.util.OMovesQuerySpecification;
import queries.util.OTwoMovesFromWinningQuerySpecification;
import queries.util.OWinningQuerySpecification;
import queries.util.OppositeXCornerQuerySpecification;
import queries.util.PreventXForkByForcingWinQuerySpecification;
import queries.util.XForkQuerySpecification;
import queries.util.XMovesQuerySpecification;
import queries.util.XWinningQuerySpecification;
import tic.tac.toe.generator.BoardVisualizer;
import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Mark;
import tictactoe.Player;
import tictactoe.Square;
import tictactoe.TictactoeFactory;

@SuppressWarnings("all")
public class TransformationRules {
  public boolean executeRule(final Engine eng, final Square square) {
    boolean _xblockexpression = false;
    {
      TictactoeFactory factory = TictactoeFactory.eINSTANCE;
      Mark mark = factory.createMark();
      mark.setColor(Color.WHITE);
      int _pos_x = square.getPos_x();
      mark.setPos_x(_pos_x);
      int _pos_y = square.getPos_y();
      mark.setPos_y(_pos_y);
      Player _whitePlayer = eng.getWhitePlayer();
      EList<Mark> _marks = _whitePlayer.getMarks();
      _xblockexpression = _marks.add(mark);
    }
    return _xblockexpression;
  }
  
  /**
   * Transformation-related extensions
   */
  @Extension
  private BatchTransformation transformation;
  
  @Extension
  private BatchTransformationStatements statements;
  
  /**
   * Transformation rule-related extensions
   */
  @Extension
  private BatchTransformationRuleFactory _batchTransformationRuleFactory = new BatchTransformationRuleFactory();
  
  @Extension
  private IModelManipulations manipulation;
  
  protected Boolean isFirstMove = Boolean.valueOf(true);
  
  protected ViatraQueryEngine engine;
  
  protected Resource resource;
  
  protected Engine tictactoeEngine;
  
  protected BoardVisualizer board;
  
  public BatchTransformationRule<OWinningMatch, OWinningMatcher> oWinningRule;
  
  public BatchTransformationRule<XWinningMatch, XWinningMatcher> xWinningPreventionRule;
  
  public BatchTransformationRule<XMovesMatch, XMovesMatcher> xMovesRule;
  
  public BatchTransformationRule<XMovesMatch, XMovesMatcher> xMovesForLoading;
  
  public BatchTransformationRule<OMovesMatch, OMovesMatcher> oMovesRule;
  
  public BatchTransformationRule<XForkMatch, XForkMatcher> xForkPreventionRule;
  
  public BatchTransformationRule<OForkMatch, OForkMatcher> oForkRule;
  
  public BatchTransformationRule<OTwoMovesFromWinningMatch, OTwoMovesFromWinningMatcher> oForceWinRule;
  
  public BatchTransformationRule<PreventXForkByForcingWinMatch, PreventXForkByForcingWinMatcher> xForkPreventionByForcingWin;
  
  public BatchTransformationRule<MarkCenterMatch, MarkCenterMatcher> markCenter;
  
  public BatchTransformationRule<OppositeXCornerMatch, OppositeXCornerMatcher> oppositeCorner;
  
  public BatchTransformationRule<EmptySidesMatch, EmptySidesMatcher> emptySides;
  
  public TransformationRules(final Resource resource, final Engine eng, final BoardVisualizer board) {
    try {
      this.tictactoeEngine = eng;
      this.resource = resource;
      this.board = board;
      final EMFScope scope = new EMFScope(resource);
      ViatraQueryEngine _on = ViatraQueryEngine.on(scope);
      this.engine = _on;
      try {
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OWinningMatch, OWinningMatcher> _createRule = this._batchTransformationRuleFactory.<OWinningMatch, OWinningMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OWinningMatch, OWinningMatcher> _name = _createRule.name("oWinningRule");
        OWinningQuerySpecification _instance = OWinningQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OWinningMatch, OWinningMatcher> _precondition = _name.precondition(_instance);
        final IMatchProcessor<OWinningMatch> _function = (OWinningMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OWinningMatch, OWinningMatcher> _action = _precondition.action(_function);
        BatchTransformationRule<OWinningMatch, OWinningMatcher> _build = _action.build();
        this.oWinningRule = _build;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XWinningMatch, XWinningMatcher> _createRule_1 = this._batchTransformationRuleFactory.<XWinningMatch, XWinningMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XWinningMatch, XWinningMatcher> _name_1 = _createRule_1.name("xWinningPreventionRule");
        XWinningQuerySpecification _instance_1 = XWinningQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XWinningMatch, XWinningMatcher> _precondition_1 = _name_1.precondition(_instance_1);
        final IMatchProcessor<XWinningMatch> _function_1 = (XWinningMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XWinningMatch, XWinningMatcher> _action_1 = _precondition_1.action(_function_1);
        BatchTransformationRule<XWinningMatch, XWinningMatcher> _build_1 = _action_1.build();
        this.xWinningPreventionRule = _build_1;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XMovesMatch, XMovesMatcher> _createRule_2 = this._batchTransformationRuleFactory.<XMovesMatch, XMovesMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XMovesMatch, XMovesMatcher> _name_2 = _createRule_2.name("XMoves");
        XMovesQuerySpecification _instance_2 = XMovesQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XMovesMatch, XMovesMatcher> _precondition_2 = _name_2.precondition(_instance_2);
        final IMatchProcessor<XMovesMatch> _function_2 = (XMovesMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.BLACK);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _blackPlayer = eng.getBlackPlayer();
          EList<Mark> _marks = _blackPlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XMovesMatch, XMovesMatcher> _action_2 = _precondition_2.action(_function_2);
        BatchTransformationRule<XMovesMatch, XMovesMatcher> _build_2 = _action_2.build();
        this.xMovesRule = _build_2;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OMovesMatch, OMovesMatcher> _createRule_3 = this._batchTransformationRuleFactory.<OMovesMatch, OMovesMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OMovesMatch, OMovesMatcher> _name_3 = _createRule_3.name("OMoves");
        OMovesQuerySpecification _instance_3 = OMovesQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OMovesMatch, OMovesMatcher> _precondition_3 = _name_3.precondition(_instance_3);
        final IMatchProcessor<OMovesMatch> _function_3 = (OMovesMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OMovesMatch, OMovesMatcher> _action_3 = _precondition_3.action(_function_3);
        BatchTransformationRule<OMovesMatch, OMovesMatcher> _build_3 = _action_3.build();
        this.oMovesRule = _build_3;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OForkMatch, OForkMatcher> _createRule_4 = this._batchTransformationRuleFactory.<OForkMatch, OForkMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OForkMatch, OForkMatcher> _name_4 = _createRule_4.name("OForkRule");
        OForkQuerySpecification _instance_4 = OForkQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OForkMatch, OForkMatcher> _precondition_4 = _name_4.precondition(_instance_4);
        final IMatchProcessor<OForkMatch> _function_4 = (OForkMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OForkMatch, OForkMatcher> _action_4 = _precondition_4.action(_function_4);
        BatchTransformationRule<OForkMatch, OForkMatcher> _build_4 = _action_4.build();
        this.oForkRule = _build_4;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XForkMatch, XForkMatcher> _createRule_5 = this._batchTransformationRuleFactory.<XForkMatch, XForkMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XForkMatch, XForkMatcher> _name_5 = _createRule_5.name("XForkPreventionRule");
        XForkQuerySpecification _instance_5 = XForkQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XForkMatch, XForkMatcher> _precondition_5 = _name_5.precondition(_instance_5);
        final IMatchProcessor<XForkMatch> _function_5 = (XForkMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XForkMatch, XForkMatcher> _action_5 = _precondition_5.action(_function_5);
        BatchTransformationRule<XForkMatch, XForkMatcher> _build_5 = _action_5.build();
        this.xForkPreventionRule = _build_5;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OTwoMovesFromWinningMatch, OTwoMovesFromWinningMatcher> _createRule_6 = this._batchTransformationRuleFactory.<OTwoMovesFromWinningMatch, OTwoMovesFromWinningMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OTwoMovesFromWinningMatch, OTwoMovesFromWinningMatcher> _name_6 = _createRule_6.name("OForceWinRule");
        OTwoMovesFromWinningQuerySpecification _instance_6 = OTwoMovesFromWinningQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OTwoMovesFromWinningMatch, OTwoMovesFromWinningMatcher> _precondition_6 = _name_6.precondition(_instance_6);
        final IMatchProcessor<OTwoMovesFromWinningMatch> _function_6 = (OTwoMovesFromWinningMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OTwoMovesFromWinningMatch, OTwoMovesFromWinningMatcher> _action_6 = _precondition_6.action(_function_6);
        BatchTransformationRule<OTwoMovesFromWinningMatch, OTwoMovesFromWinningMatcher> _build_6 = _action_6.build();
        this.oForceWinRule = _build_6;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<PreventXForkByForcingWinMatch, PreventXForkByForcingWinMatcher> _createRule_7 = this._batchTransformationRuleFactory.<PreventXForkByForcingWinMatch, PreventXForkByForcingWinMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<PreventXForkByForcingWinMatch, PreventXForkByForcingWinMatcher> _name_7 = _createRule_7.name("XForkPreventionByForcingWin");
        PreventXForkByForcingWinQuerySpecification _instance_7 = PreventXForkByForcingWinQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<PreventXForkByForcingWinMatch, PreventXForkByForcingWinMatcher> _precondition_7 = _name_7.precondition(_instance_7);
        final IMatchProcessor<PreventXForkByForcingWinMatch> _function_7 = (PreventXForkByForcingWinMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<PreventXForkByForcingWinMatch, PreventXForkByForcingWinMatcher> _action_7 = _precondition_7.action(_function_7);
        BatchTransformationRule<PreventXForkByForcingWinMatch, PreventXForkByForcingWinMatcher> _build_7 = _action_7.build();
        this.xForkPreventionByForcingWin = _build_7;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<MarkCenterMatch, MarkCenterMatcher> _createRule_8 = this._batchTransformationRuleFactory.<MarkCenterMatch, MarkCenterMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<MarkCenterMatch, MarkCenterMatcher> _name_8 = _createRule_8.name("MarkCenter");
        MarkCenterQuerySpecification _instance_8 = MarkCenterQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<MarkCenterMatch, MarkCenterMatcher> _precondition_8 = _name_8.precondition(_instance_8);
        final IMatchProcessor<MarkCenterMatch> _function_8 = (MarkCenterMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<MarkCenterMatch, MarkCenterMatcher> _action_8 = _precondition_8.action(_function_8);
        BatchTransformationRule<MarkCenterMatch, MarkCenterMatcher> _build_8 = _action_8.build();
        this.markCenter = _build_8;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OppositeXCornerMatch, OppositeXCornerMatcher> _createRule_9 = this._batchTransformationRuleFactory.<OppositeXCornerMatch, OppositeXCornerMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OppositeXCornerMatch, OppositeXCornerMatcher> _name_9 = _createRule_9.name("OppositeCorner");
        OppositeXCornerQuerySpecification _instance_9 = OppositeXCornerQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OppositeXCornerMatch, OppositeXCornerMatcher> _precondition_9 = _name_9.precondition(_instance_9);
        final IMatchProcessor<OppositeXCornerMatch> _function_9 = (OppositeXCornerMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<OppositeXCornerMatch, OppositeXCornerMatcher> _action_9 = _precondition_9.action(_function_9);
        BatchTransformationRule<OppositeXCornerMatch, OppositeXCornerMatcher> _build_9 = _action_9.build();
        this.oppositeCorner = _build_9;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<EmptySidesMatch, EmptySidesMatcher> _createRule_10 = this._batchTransformationRuleFactory.<EmptySidesMatch, EmptySidesMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<EmptySidesMatch, EmptySidesMatcher> _name_10 = _createRule_10.name("EmptySides");
        EmptySidesQuerySpecification _instance_10 = EmptySidesQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<EmptySidesMatch, EmptySidesMatcher> _precondition_10 = _name_10.precondition(_instance_10);
        final IMatchProcessor<EmptySidesMatch> _function_10 = (EmptySidesMatch it) -> {
          TictactoeFactory factory = TictactoeFactory.eINSTANCE;
          Mark mark = factory.createMark();
          mark.setColor(Color.WHITE);
          Square _square = it.getSquare();
          int _pos_x = _square.getPos_x();
          mark.setPos_x(_pos_x);
          Square _square_1 = it.getSquare();
          int _pos_y = _square_1.getPos_y();
          mark.setPos_y(_pos_y);
          Player _whitePlayer = eng.getWhitePlayer();
          EList<Mark> _marks = _whitePlayer.getMarks();
          _marks.add(mark);
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<EmptySidesMatch, EmptySidesMatcher> _action_10 = _precondition_10.action(_function_10);
        BatchTransformationRule<EmptySidesMatch, EmptySidesMatcher> _build_10 = _action_10.build();
        this.emptySides = _build_10;
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XMovesMatch, XMovesMatcher> _createRule_11 = this._batchTransformationRuleFactory.<XMovesMatch, XMovesMatcher>createRule();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XMovesMatch, XMovesMatcher> _name_11 = _createRule_11.name("XMovesForLoading");
        XMovesQuerySpecification _instance_11 = XMovesQuerySpecification.instance();
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XMovesMatch, XMovesMatcher> _precondition_11 = _name_11.precondition(_instance_11);
        final IMatchProcessor<XMovesMatch> _function_11 = (XMovesMatch it) -> {
        };
        BatchTransformationRuleFactory.BatchTransformationRuleBuilder<XMovesMatch, XMovesMatcher> _action_11 = _precondition_11.action(_function_11);
        BatchTransformationRule<XMovesMatch, XMovesMatcher> _build_11 = _action_11.build();
        this.xMovesForLoading = _build_11;
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      this.createTransformation();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void execute(final Square square, final Engine eng) {
    try {
      if ((this.isFirstMove).booleanValue()) {
        this.statements.<XMovesMatch>fireOne(this.xMovesForLoading);
        this.isFirstMove = Boolean.valueOf((!(this.isFirstMove).booleanValue()));
      }
      Boolean _isOTurn = eng.getIsOTurn();
      boolean _not = (!(_isOTurn).booleanValue());
      if (_not) {
        Pair<String, Square> _pair = new Pair<String, Square>("square", square);
        this.statements.<XMovesMatch>fireOne(this.xMovesRule, _pair);
        Boolean _isOTurn_1 = eng.getIsOTurn();
        boolean _not_1 = (!(_isOTurn_1).booleanValue());
        eng.setIsOTurn(Boolean.valueOf(_not_1));
      }
      Boolean _isOTurn_2 = eng.getIsOTurn();
      if ((_isOTurn_2).booleanValue()) {
        try {
          this.statements.<OWinningMatch>fireOne(this.oWinningRule);
          Boolean _isOTurn_3 = eng.getIsOTurn();
          boolean _not_2 = (!(_isOTurn_3).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_2));
          return;
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        try {
          this.statements.<XWinningMatch>fireOne(this.xWinningPreventionRule);
          Boolean _isOTurn_4 = eng.getIsOTurn();
          boolean _not_3 = (!(_isOTurn_4).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_3));
          return;
        } catch (final Throwable _t_1) {
          if (_t_1 instanceof Exception) {
            final Exception e_1 = (Exception)_t_1;
          } else {
            throw Exceptions.sneakyThrow(_t_1);
          }
        }
        try {
          this.statements.<OForkMatch>fireOne(this.oForkRule);
          Boolean _isOTurn_5 = eng.getIsOTurn();
          boolean _not_4 = (!(_isOTurn_5).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_4));
          return;
        } catch (final Throwable _t_2) {
          if (_t_2 instanceof Exception) {
            final Exception e_2 = (Exception)_t_2;
          } else {
            throw Exceptions.sneakyThrow(_t_2);
          }
        }
        try {
          this.statements.<PreventXForkByForcingWinMatch>fireOne(this.xForkPreventionByForcingWin);
          Boolean _isOTurn_6 = eng.getIsOTurn();
          boolean _not_5 = (!(_isOTurn_6).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_5));
          return;
        } catch (final Throwable _t_3) {
          if (_t_3 instanceof Exception) {
            final Exception e_3 = (Exception)_t_3;
          } else {
            throw Exceptions.sneakyThrow(_t_3);
          }
        }
        try {
          this.statements.<XForkMatch>fireOne(this.xForkPreventionRule);
          Boolean _isOTurn_7 = eng.getIsOTurn();
          boolean _not_6 = (!(_isOTurn_7).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_6));
          return;
        } catch (final Throwable _t_4) {
          if (_t_4 instanceof Exception) {
            final Exception e_4 = (Exception)_t_4;
          } else {
            throw Exceptions.sneakyThrow(_t_4);
          }
        }
        try {
          this.statements.<MarkCenterMatch>fireOne(this.markCenter);
          Boolean _isOTurn_8 = eng.getIsOTurn();
          boolean _not_7 = (!(_isOTurn_8).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_7));
          return;
        } catch (final Throwable _t_5) {
          if (_t_5 instanceof Exception) {
            final Exception e_5 = (Exception)_t_5;
          } else {
            throw Exceptions.sneakyThrow(_t_5);
          }
        }
        try {
          this.statements.<OppositeXCornerMatch>fireOne(this.oppositeCorner);
          Boolean _isOTurn_9 = eng.getIsOTurn();
          boolean _not_8 = (!(_isOTurn_9).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_8));
          return;
        } catch (final Throwable _t_6) {
          if (_t_6 instanceof Exception) {
            final Exception e_6 = (Exception)_t_6;
          } else {
            throw Exceptions.sneakyThrow(_t_6);
          }
        }
        try {
          this.statements.<EmptySidesMatch>fireOne(this.emptySides);
          Boolean _isOTurn_10 = eng.getIsOTurn();
          boolean _not_9 = (!(_isOTurn_10).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_9));
          return;
        } catch (final Throwable _t_7) {
          if (_t_7 instanceof Exception) {
            final Exception e_7 = (Exception)_t_7;
          } else {
            throw Exceptions.sneakyThrow(_t_7);
          }
        }
        try {
          this.statements.<OMovesMatch>fireOne(this.oMovesRule);
          Boolean _isOTurn_11 = eng.getIsOTurn();
          boolean _not_10 = (!(_isOTurn_11).booleanValue());
          eng.setIsOTurn(Boolean.valueOf(_not_10));
          return;
        } catch (final Throwable _t_8) {
          if (_t_8 instanceof Exception) {
            final Exception e_8 = (Exception)_t_8;
          } else {
            throw Exceptions.sneakyThrow(_t_8);
          }
        }
        Boolean _isOTurn_12 = eng.getIsOTurn();
        boolean _not_11 = (!(_isOTurn_12).booleanValue());
        eng.setIsOTurn(Boolean.valueOf(_not_11));
      }
    } catch (final Throwable _t_9) {
      if (_t_9 instanceof Exception) {
        final Exception e_9 = (Exception)_t_9;
      } else {
        throw Exceptions.sneakyThrow(_t_9);
      }
    }
  }
  
  private BatchTransformationStatements createTransformation() {
    try {
      BatchTransformationStatements _xblockexpression = null;
      {
        SimpleModelManipulations _simpleModelManipulations = new SimpleModelManipulations(this.engine);
        this.manipulation = _simpleModelManipulations;
        BatchTransformation.BatchTransformationBuilder _forEngine = BatchTransformation.forEngine(this.engine);
        BatchTransformation _build = _forEngine.build();
        this.transformation = _build;
        BatchTransformationStatements _transformationStatements = this.transformation.getTransformationStatements();
        _xblockexpression = this.statements = _transformationStatements;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void dispose() {
    boolean _notEquals = (!Objects.equal(this.transformation, null));
    if (_notEquals) {
      RuleEngine _ruleEngine = this.transformation.getRuleEngine();
      _ruleEngine.dispose();
    }
    this.transformation = null;
    return;
  }
}
