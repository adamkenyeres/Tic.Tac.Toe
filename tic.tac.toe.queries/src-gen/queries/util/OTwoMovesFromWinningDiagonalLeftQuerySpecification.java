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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import queries.OTwoMovesFromWinningDiagonalLeftMatch;
import queries.OTwoMovesFromWinningDiagonalLeftMatcher;
import queries.util.MarkOnSquareQuerySpecification;
import queries.util.TCNorthWestWithSameMarksQuerySpecification;
import queries.util.TCSouthEastWithSameMarksQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate OTwoMovesFromWinningDiagonalLeftMatcher in a type-safe way.
 * 
 * @see OTwoMovesFromWinningDiagonalLeftMatcher
 * @see OTwoMovesFromWinningDiagonalLeftMatch
 * 
 */
@SuppressWarnings("all")
public final class OTwoMovesFromWinningDiagonalLeftQuerySpecification extends BaseGeneratedEMFQuerySpecification<OTwoMovesFromWinningDiagonalLeftMatcher> {
  private OTwoMovesFromWinningDiagonalLeftQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static OTwoMovesFromWinningDiagonalLeftQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected OTwoMovesFromWinningDiagonalLeftMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OTwoMovesFromWinningDiagonalLeftMatcher.on(engine);
  }
  
  @Override
  public OTwoMovesFromWinningDiagonalLeftMatcher instantiate() throws ViatraQueryException {
    return OTwoMovesFromWinningDiagonalLeftMatcher.create();
  }
  
  @Override
  public OTwoMovesFromWinningDiagonalLeftMatch newEmptyMatch() {
    return OTwoMovesFromWinningDiagonalLeftMatch.newEmptyMatch();
  }
  
  @Override
  public OTwoMovesFromWinningDiagonalLeftMatch newMatch(final Object... parameters) {
    return OTwoMovesFromWinningDiagonalLeftMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Engine) parameters[1], (tictactoe.Color) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link OTwoMovesFromWinningDiagonalLeftQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link OTwoMovesFromWinningDiagonalLeftQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static OTwoMovesFromWinningDiagonalLeftQuerySpecification INSTANCE = new OTwoMovesFromWinningDiagonalLeftQuerySpecification();
    
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
    private final static OTwoMovesFromWinningDiagonalLeftQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSquare = new PParameter("square", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEngine = new PParameter("engine", "tictactoe.Engine", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Engine")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pColor = new PParameter("color", "tictactoe.Color", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://example.com/tictactoe", "Color")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSquare, parameter_pEngine, parameter_pColor);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.OTwoMovesFromWinningDiagonalLeft";
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
      		PVariable var_cntONW = body.getOrCreateVariableByName("cntONW");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_cntOSE = body.getOrCreateVariableByName("cntOSE");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
      		PVariable var_white = body.getOrCreateVariableByName("white");
      		PVariable var_markO = body.getOrCreateVariableByName("markO");
      		PVariable var_cntXNW = body.getOrCreateVariableByName("cntXNW");
      		PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
      		PVariable var_colorX = body.getOrCreateVariableByName("colorX");
      		PVariable var_cntXSE = body.getOrCreateVariableByName("cntXSE");
      		PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
      		PVariable var___5_ = body.getOrCreateVariableByName("_<5>");
      		PVariable var_black = body.getOrCreateVariableByName("black");
      		PVariable var_markX = body.getOrCreateVariableByName("markX");
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		new TypeConstraint(body, new FlatTuple(var_color), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://example.com/tictactoe", "Color")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_square, parameter_pSquare),
      		   new ExportedParameter(body, var_engine, parameter_pEngine),
      		   new ExportedParameter(body, var_color, parameter_pColor)
      		));
      		// 	Engine.square(engine, square)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		// 	cntONW == count find TCNorthWestWithSameMarks(square, _, color)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___0_, var_color), TCNorthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Equality(body, var_cntONW, var__virtual_1_);
      		// 	cntOSE == count find TCSouthEastWithSameMarks(square, _, color)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___1_, var_color), TCSouthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		new Equality(body, var_cntOSE, var__virtual_2_);
      		// 	neg find markOnSquare(_, square, engine)
      		new NegativePatternCall(body, new FlatTuple(var___2_, var_square, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	check(cntONW + cntOSE == 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern OTwoMovesFromWinningDiagonalLeft";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntONW", "cntOSE");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntONW = (Integer) provider.getValue("cntONW");
      		        Integer cntOSE = (Integer) provider.getValue("cntOSE");
      		        return evaluateExpression_1_1(cntONW, cntOSE);
      		    }
      		},  null); 
      		// 	Engine.whitePlayer(engine, white)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "whitePlayer")));
      		new Equality(body, var__virtual_3_, var_white);
      		// 	Player.marks(white, markO)
      		new TypeConstraint(body, new FlatTuple(var_white), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_white, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_4_, var_markO);
      		// 	Mark.color(markO, color)
      		new TypeConstraint(body, new FlatTuple(var_markO), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_markO, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_5_, var_color);
      		// 	cntXNW == count find TCNorthWestWithSameMarks(square, _, colorX)
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___3_, var_colorX), TCNorthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_6_);
      		new Equality(body, var_cntXNW, var__virtual_6_);
      		// 	cntXSE == count find TCSouthEastWithSameMarks(square, _, colorX)
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___4_, var_colorX), TCSouthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_7_);
      		new Equality(body, var_cntXSE, var__virtual_7_);
      		// 	neg find markOnSquare(_, square, engine)
      		new NegativePatternCall(body, new FlatTuple(var___5_, var_square, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	check(cntXNW + cntXSE == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern OTwoMovesFromWinningDiagonalLeft";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXNW", "cntXSE");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXNW = (Integer) provider.getValue("cntXNW");
      		        Integer cntXSE = (Integer) provider.getValue("cntXSE");
      		        return evaluateExpression_1_2(cntXNW, cntXSE);
      		    }
      		},  null); 
      		// 	Engine.blackPlayer(engine, black)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "blackPlayer")));
      		new Equality(body, var__virtual_8_, var_black);
      		// 	Player.marks(black, markX)
      		new TypeConstraint(body, new FlatTuple(var_black), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var_black, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_9_, var_markX);
      		// 	Mark.color(markX, colorX)
      		new TypeConstraint(body, new FlatTuple(var_markX), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_markX, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_10_, var_colorX);
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
  
  private static boolean evaluateExpression_1_1(final Integer cntONW, final Integer cntOSE) {
    return (((cntONW).intValue() + (cntOSE).intValue()) == 1);
  }
  
  private static boolean evaluateExpression_1_2(final Integer cntXNW, final Integer cntXSE) {
    return (((cntXNW).intValue() + (cntXSE).intValue()) == 0);
  }
}
