/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TransitiveClosure.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import queries.TCNorhtWestMatch;
import queries.TCNorhtWestMatcher;
import queries.util.NWQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TCNorhtWestMatcher in a type-safe way.
 * 
 * @see TCNorhtWestMatcher
 * @see TCNorhtWestMatch
 * 
 */
@SuppressWarnings("all")
public final class TCNorhtWestQuerySpecification extends BaseGeneratedEMFQuerySpecification<TCNorhtWestMatcher> {
  private TCNorhtWestQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TCNorhtWestQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TCNorhtWestMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCNorhtWestMatcher.on(engine);
  }
  
  @Override
  public TCNorhtWestMatcher instantiate() throws ViatraQueryException {
    return TCNorhtWestMatcher.create();
  }
  
  @Override
  public TCNorhtWestMatch newEmptyMatch() {
    return TCNorhtWestMatch.newEmptyMatch();
  }
  
  @Override
  public TCNorhtWestMatch newMatch(final Object... parameters) {
    return TCNorhtWestMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Square) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TCNorhtWestQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link TCNorhtWestQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TCNorhtWestQuerySpecification INSTANCE = new TCNorhtWestQuerySpecification();
    
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
    private final static TCNorhtWestQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pS1 = new PParameter("s1", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pS2 = new PParameter("s2", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pS1, parameter_pS2);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.TCNorhtWest";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("s1","s2");
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
      		PVariable var_s1 = body.getOrCreateVariableByName("s1");
      		PVariable var_s2 = body.getOrCreateVariableByName("s2");
      		new TypeConstraint(body, new FlatTuple(var_s1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_s2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_s1, parameter_pS1),
      		   new ExportedParameter(body, var_s2, parameter_pS2)
      		));
      		// 	find NW +(s1, s2)
      		new BinaryTransitiveClosure(body, new FlatTuple(var_s1, var_s2), NWQuerySpecification.instance().getInternalQueryRepresentation());
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
}
