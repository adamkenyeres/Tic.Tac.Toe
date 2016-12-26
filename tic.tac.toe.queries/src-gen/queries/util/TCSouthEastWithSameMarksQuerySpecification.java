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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import queries.TCSouthEastWithSameMarksMatch;
import queries.TCSouthEastWithSameMarksMatcher;
import queries.util.MarkOnSquareQuerySpecification;
import queries.util.SEQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate TCSouthEastWithSameMarksMatcher in a type-safe way.
 * 
 * @see TCSouthEastWithSameMarksMatcher
 * @see TCSouthEastWithSameMarksMatch
 * 
 */
@SuppressWarnings("all")
public final class TCSouthEastWithSameMarksQuerySpecification extends BaseGeneratedEMFQuerySpecification<TCSouthEastWithSameMarksMatcher> {
  private TCSouthEastWithSameMarksQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TCSouthEastWithSameMarksQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TCSouthEastWithSameMarksMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCSouthEastWithSameMarksMatcher.on(engine);
  }
  
  @Override
  public TCSouthEastWithSameMarksMatcher instantiate() throws ViatraQueryException {
    return TCSouthEastWithSameMarksMatcher.create();
  }
  
  @Override
  public TCSouthEastWithSameMarksMatch newEmptyMatch() {
    return TCSouthEastWithSameMarksMatch.newEmptyMatch();
  }
  
  @Override
  public TCSouthEastWithSameMarksMatch newMatch(final Object... parameters) {
    return TCSouthEastWithSameMarksMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Square) parameters[1], (tictactoe.Color) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TCSouthEastWithSameMarksQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link TCSouthEastWithSameMarksQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TCSouthEastWithSameMarksQuerySpecification INSTANCE = new TCSouthEastWithSameMarksQuerySpecification();
    
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
    private final static TCSouthEastWithSameMarksQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pS1 = new PParameter("s1", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pS2 = new PParameter("s2", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pColor = new PParameter("color", "tictactoe.Color", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://example.com/tictactoe", "Color")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pS1, parameter_pS2, parameter_pColor);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.TCSouthEastWithSameMarks";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("s1","s2","color");
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
      		PVariable var_color = body.getOrCreateVariableByName("color");
      		PVariable var_mark = body.getOrCreateVariableByName("mark");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_s1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_s2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_color), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://example.com/tictactoe", "Color")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_s1, parameter_pS1),
      		   new ExportedParameter(body, var_s2, parameter_pS2),
      		   new ExportedParameter(body, var_color, parameter_pColor)
      		));
      		// 	find SE +(s1, s2)
      		new BinaryTransitiveClosure(body, new FlatTuple(var_s1, var_s2), SEQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find markOnSquare(mark, s2, _)
      		new PositivePatternCall(body, new FlatTuple(var_mark, var_s2, var___0_), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Mark.color(mark, color)
      		new TypeConstraint(body, new FlatTuple(var_mark), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_mark, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_0_, var_color);
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
