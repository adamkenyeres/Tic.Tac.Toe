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
import queries.EastMatch;
import queries.EastMatcher;

/**
 * A pattern-specific query specification that can instantiate EastMatcher in a type-safe way.
 * 
 * @see EastMatcher
 * @see EastMatch
 * 
 */
@SuppressWarnings("all")
public final class EastQuerySpecification extends BaseGeneratedEMFQuerySpecification<EastMatcher> {
  private EastQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static EastQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EastMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EastMatcher.on(engine);
  }
  
  @Override
  public EastMatcher instantiate() throws ViatraQueryException {
    return EastMatcher.create();
  }
  
  @Override
  public EastMatch newEmptyMatch() {
    return EastMatch.newEmptyMatch();
  }
  
  @Override
  public EastMatch newMatch(final Object... parameters) {
    return EastMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Square) parameters[1], (tictactoe.Engine) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EastQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link EastQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EastQuerySpecification INSTANCE = new EastQuerySpecification();
    
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
    private final static EastQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSquareW = new PParameter("squareW", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSquareE = new PParameter("squareE", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEngine = new PParameter("engine", "tictactoe.Engine", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Engine")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSquareW, parameter_pSquareE, parameter_pEngine);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.East";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("squareW","squareE","engine");
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
      		PVariable var_squareW = body.getOrCreateVariableByName("squareW");
      		PVariable var_squareE = body.getOrCreateVariableByName("squareE");
      		PVariable var_engine = body.getOrCreateVariableByName("engine");
      		PVariable var_pos_W_x = body.getOrCreateVariableByName("pos_W_x");
      		PVariable var_pos_E_x = body.getOrCreateVariableByName("pos_E_x");
      		PVariable var_pos_W_y = body.getOrCreateVariableByName("pos_W_y");
      		new TypeConstraint(body, new FlatTuple(var_squareW), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_squareE), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_squareW, parameter_pSquareW),
      		   new ExportedParameter(body, var_squareE, parameter_pSquareE),
      		   new ExportedParameter(body, var_engine, parameter_pEngine)
      		));
      		// 	Engine.square(engine,squareW)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_squareW);
      		// 	Square.pos_x(squareW,pos_W_x)
      		new TypeConstraint(body, new FlatTuple(var_squareW), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_squareW, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_1_, var_pos_W_x);
      		// 	Square.pos_x(squareE,pos_E_x)
      		new TypeConstraint(body, new FlatTuple(var_squareE), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_squareE, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_x")));
      		new Equality(body, var__virtual_2_, var_pos_E_x);
      		// 	Square.pos_y(squareW, pos_W_y)
      		new TypeConstraint(body, new FlatTuple(var_squareW), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_squareW, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_3_, var_pos_W_y);
      		// 	Square.pos_y(squareE, pos_W_y)
      		new TypeConstraint(body, new FlatTuple(var_squareE), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_squareE, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Square", "pos_y")));
      		new Equality(body, var__virtual_4_, var_pos_W_y);
      		// 	check(pos_E_x == pos_W_x + 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern East";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("pos_E_x", "pos_W_x");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer pos_E_x = (Integer) provider.getValue("pos_E_x");
      		        Integer pos_W_x = (Integer) provider.getValue("pos_W_x");
      		        return evaluateExpression_1_1(pos_E_x, pos_W_x);
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
  
  private static boolean evaluateExpression_1_1(final Integer pos_E_x, final Integer pos_W_x) {
    return ((pos_E_x).intValue() == ((pos_W_x).intValue() + 1));
  }
}
