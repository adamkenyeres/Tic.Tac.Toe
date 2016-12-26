/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/BasicRules.vql
 */
package queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import queries.OppositeXCornerMatch;
import queries.OppositeXCornerMatcher;
import queries.util.CornersQuerySpecification;
import queries.util.MarkOnSquareQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate OppositeXCornerMatcher in a type-safe way.
 * 
 * @see OppositeXCornerMatcher
 * @see OppositeXCornerMatch
 * 
 */
@SuppressWarnings("all")
public final class OppositeXCornerQuerySpecification extends BaseGeneratedEMFQuerySpecification<OppositeXCornerMatcher> {
  private OppositeXCornerQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static OppositeXCornerQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected OppositeXCornerMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OppositeXCornerMatcher.on(engine);
  }
  
  @Override
  public OppositeXCornerMatcher instantiate() throws ViatraQueryException {
    return OppositeXCornerMatcher.create();
  }
  
  @Override
  public OppositeXCornerMatch newEmptyMatch() {
    return OppositeXCornerMatch.newEmptyMatch();
  }
  
  @Override
  public OppositeXCornerMatch newMatch(final Object... parameters) {
    return OppositeXCornerMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Engine) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link OppositeXCornerQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link OppositeXCornerQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static OppositeXCornerQuerySpecification INSTANCE = new OppositeXCornerQuerySpecification();
    
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
    private final static OppositeXCornerQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSquare = new PParameter("square", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEngine = new PParameter("engine", "tictactoe.Engine", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Engine")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSquare, parameter_pEngine);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.oppositeXCorner";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("square","engine");
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
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_squareX = body.getOrCreateVariableByName("squareX");
      		PVariable var_markX = body.getOrCreateVariableByName("markX");
      		PVariable var_black = body.getOrCreateVariableByName("black");
      		PVariable var_pos_x = body.getOrCreateVariableByName("pos_x");
      		PVariable var_posX_x = body.getOrCreateVariableByName("posX_x");
      		PVariable var_pos_y = body.getOrCreateVariableByName("pos_y");
      		PVariable var_posX_y = body.getOrCreateVariableByName("posX_y");
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_square, parameter_pSquare),
      		   new ExportedParameter(body, var_engine, parameter_pEngine)
      		));
      		// 	Engine.square(engine, square)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		// 	find corners(square, engine)
      		new PositivePatternCall(body, new FlatTuple(var_square, var_engine), CornersQuerySpecification.instance().getInternalQueryRepresentation());
      		// 		neg find markOnSquare(_,square, engine)
      		new NegativePatternCall(body, new FlatTuple(var___0_, var_square, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find corners(squareX, engine)
      		new PositivePatternCall(body, new FlatTuple(var_squareX, var_engine), CornersQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find markOnSquare(markX,squareX, engine)
      		new NegativePatternCall(body, new FlatTuple(var_markX, var_squareX, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Engine.blackPlayer(engine, black)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "blackPlayer")));
      		new Equality(body, var__virtual_1_, var_black);
      		// 	Player.marks(black,markX)
      		new TypeConstraint(body, new FlatTuple(var_black), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_black, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_2_, var_markX);
      		// 	Square.pos_x(square, pos_x)
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_square, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_3_, var_pos_x);
      		// 	Square.pos_x(squareX, posX_x)
      		new TypeConstraint(body, new FlatTuple(var_squareX), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_squareX, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_4_, var_posX_x);
      		// 	Square.pos_y(square, pos_y)
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_square, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_5_, var_pos_y);
      		// 	Square.pos_y(squareX, posX_y)
      		new TypeConstraint(body, new FlatTuple(var_squareX), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_squareX, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_6_, var_posX_y);
      		// 		check(pos_x == -1*posX_x)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern oppositeXCorner";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("posX_x", "pos_x");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer posX_x = (Integer) provider.getValue("posX_x");
      		        Integer pos_x = (Integer) provider.getValue("pos_x");
      		        return evaluateExpression_1_1(posX_x, pos_x);
      		    }
      		},  null); 
      		// 	check(pos_y == -1*posX_y)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern oppositeXCorner";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("posX_y", "pos_y");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer posX_y = (Integer) provider.getValue("posX_y");
      		        Integer pos_y = (Integer) provider.getValue("pos_y");
      		        return evaluateExpression_1_2(posX_y, pos_y);
      		    }
      		},  null); 
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
  
  private static boolean evaluateExpression_1_1(final Integer posX_x, final Integer pos_x) {
    return ((pos_x).intValue() == ((-1) * (posX_x).intValue()));
  }
  
  private static boolean evaluateExpression_1_2(final Integer posX_y, final Integer pos_y) {
    return ((pos_y).intValue() == ((-1) * (posX_y).intValue()));
  }
}
