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
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import queries.EMatch;
import queries.EMatcher;
import queries.util.EastQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate EMatcher in a type-safe way.
 * 
 * @see EMatcher
 * @see EMatch
 * 
 */
@SuppressWarnings("all")
public final class EQuerySpecification extends BaseGeneratedEMFQuerySpecification<EMatcher> {
  private EQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static EQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EMatcher.on(engine);
  }
  
  @Override
  public EMatcher instantiate() throws ViatraQueryException {
    return EMatcher.create();
  }
  
  @Override
  public EMatch newEmptyMatch() {
    return EMatch.newEmptyMatch();
  }
  
  @Override
  public EMatch newMatch(final Object... parameters) {
    return EMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Square) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link EQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EQuerySpecification INSTANCE = new EQuerySpecification();
    
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
    private final static EQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSource = new PParameter("source", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pTarget = new PParameter("target", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSource, parameter_pTarget);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.E";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("source","target");
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
      		PVariable var_source = body.getOrCreateVariableByName("source");
      		PVariable var_target = body.getOrCreateVariableByName("target");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_source, parameter_pSource),
      		   new ExportedParameter(body, var_target, parameter_pTarget)
      		));
      		// 	find East(source, target, _)
      		new PositivePatternCall(body, new FlatTuple(var_source, var_target, var___0_), EastQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PAnnotation annotation = new PAnnotation("QueryBasedFeature");
      		addAnnotation(annotation);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
