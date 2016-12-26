/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import queries.SouthEastMatch;
import queries.SouthEastMatcher;

/**
 * A pattern-specific query specification that can instantiate SouthEastMatcher in a type-safe way.
 * 
 * @see SouthEastMatcher
 * @see SouthEastMatch
 * 
 */
@SuppressWarnings("all")
public final class SouthEastQuerySpecification extends BaseGeneratedEMFQuerySpecification<SouthEastMatcher> {
  private SouthEastQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static SouthEastQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SouthEastMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SouthEastMatcher.on(engine);
  }
  
  @Override
  public SouthEastMatcher instantiate() throws ViatraQueryException {
    return SouthEastMatcher.create();
  }
  
  @Override
  public SouthEastMatch newEmptyMatch() {
    return SouthEastMatch.newEmptyMatch();
  }
  
  @Override
  public SouthEastMatch newMatch(final Object... parameters) {
    return SouthEastMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Square) parameters[1], (tictactoe.Engine) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link SouthEastQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link SouthEastQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static SouthEastQuerySpecification INSTANCE = new SouthEastQuerySpecification();
    
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
    private final static SouthEastQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSquareN = new PParameter("squareN", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSquareS = new PParameter("squareS", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEngine = new PParameter("engine", "tictactoe.Engine", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Engine")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSquareN, parameter_pSquareS, parameter_pEngine);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.SouthEast";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("squareN","squareS","engine");
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
      		PVariable var_squareN = body.getOrCreateVariableByName("squareN");
      		PVariable var_squareS = body.getOrCreateVariableByName("squareS");
      		PVariable var_engine = body.getOrCreateVariableByName("engine");
      		PVariable var_pos_N_x = body.getOrCreateVariableByName("pos_N_x");
      		PVariable var_pos_S_x = body.getOrCreateVariableByName("pos_S_x");
      		PVariable var_pos_N_y = body.getOrCreateVariableByName("pos_N_y");
      		PVariable var_pos_S_y = body.getOrCreateVariableByName("pos_S_y");
      		new TypeConstraint(body, new FlatTuple(var_squareN), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_squareS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_squareN, parameter_pSquareN),
      		   new ExportedParameter(body, var_squareS, parameter_pSquareS),
      		   new ExportedParameter(body, var_engine, parameter_pEngine)
      		));
      		// 	Engine.square(engine,squareN)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_squareN);
      		// 	Engine.square(engine,squareS)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_1_, var_squareS);
      		// 	Square.pos_x(squareN,pos_N_x)
      		new TypeConstraint(body, new FlatTuple(var_squareN), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_squareN, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_2_, var_pos_N_x);
      		// 	Square.pos_x(squareS,pos_S_x)
      		new TypeConstraint(body, new FlatTuple(var_squareS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_squareS, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_3_, var_pos_S_x);
      		// 	Square.pos_y(squareN, pos_N_y)
      		new TypeConstraint(body, new FlatTuple(var_squareN), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_squareN, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_4_, var_pos_N_y);
      		// 	Square.pos_y(squareS, pos_S_y)
      		new TypeConstraint(body, new FlatTuple(var_squareS), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_squareS, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_5_, var_pos_S_y);
      		// 	check(pos_N_y == pos_S_y + 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern SouthEast";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("pos_N_y", "pos_S_y");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer pos_N_y = (Integer) provider.getValue("pos_N_y");
      		        Integer pos_S_y = (Integer) provider.getValue("pos_S_y");
      		        return evaluateExpression_1_1(pos_N_y, pos_S_y);
      		    }
      		},  null); 
      		// 	check(pos_S_x == pos_N_x + 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern SouthEast";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("pos_N_x", "pos_S_x");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer pos_N_x = (Integer) provider.getValue("pos_N_x");
      		        Integer pos_S_x = (Integer) provider.getValue("pos_S_x");
      		        return evaluateExpression_1_2(pos_N_x, pos_S_x);
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
  
  private static boolean evaluateExpression_1_1(final Integer pos_N_y, final Integer pos_S_y) {
    return ((pos_N_y).intValue() == ((pos_S_y).intValue() + 1));
  }
  
  private static boolean evaluateExpression_1_2(final Integer pos_N_x, final Integer pos_S_x) {
    return ((pos_S_x).intValue() == ((pos_N_x).intValue() + 1));
  }
}
