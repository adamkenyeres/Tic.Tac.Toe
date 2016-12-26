/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TransitiveClosure.vql
 */
package queries;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.TCWestWithEmptyMarksMatch;
import queries.util.TCWestWithEmptyMarksQuerySpecification;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.TCWestWithEmptyMarks pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TCWestWithEmptyMarksMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern TCWestWithEmptyMarks(s1 : Square, s2 : Square, engine : Engine) {
 * 	Engine.square(engine, s1);
 * 	Engine.square(engine, s2);
 * 	find TCWest(s1, s2);
 * 	neg find markOnSquare(_, s2, engine);
 * 	neg find markOnSquare(_, s1, engine);
 * }
 * </pre></code>
 * 
 * @see TCWestWithEmptyMarksMatch
 * @see TCWestWithEmptyMarksProcessor
 * @see TCWestWithEmptyMarksQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TCWestWithEmptyMarksMatcher extends BaseMatcher<TCWestWithEmptyMarksMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TCWestWithEmptyMarksMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TCWestWithEmptyMarksMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (TCWestWithEmptyMarksMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TCWestWithEmptyMarksMatcher create() throws ViatraQueryException {
    return new TCWestWithEmptyMarksMatcher();
  }
  
  private final static int POSITION_S1 = 0;
  
  private final static int POSITION_S2 = 1;
  
  private final static int POSITION_ENGINE = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TCWestWithEmptyMarksMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TCWestWithEmptyMarksMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return matches represented as a TCWestWithEmptyMarksMatch object.
   * 
   */
  public Collection<TCWestWithEmptyMarksMatch> getAllMatches(final Square pS1, final Square pS2, final Engine pEngine) {
    return rawGetAllMatches(new Object[]{pS1, pS2, pEngine});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return a match represented as a TCWestWithEmptyMarksMatch object, or null if no match is found.
   * 
   */
  public TCWestWithEmptyMarksMatch getOneArbitraryMatch(final Square pS1, final Square pS2, final Engine pEngine) {
    return rawGetOneArbitraryMatch(new Object[]{pS1, pS2, pEngine});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pS1, final Square pS2, final Engine pEngine) {
    return rawHasMatch(new Object[]{pS1, pS2, pEngine});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pS1, final Square pS2, final Engine pEngine) {
    return rawCountMatches(new Object[]{pS1, pS2, pEngine});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pS1, final Square pS2, final Engine pEngine, final IMatchProcessor<? super TCWestWithEmptyMarksMatch> processor) {
    rawForEachMatch(new Object[]{pS1, pS2, pEngine}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pS1, final Square pS2, final Engine pEngine, final IMatchProcessor<? super TCWestWithEmptyMarksMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS1, pS2, pEngine}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TCWestWithEmptyMarksMatch newMatch(final Square pS1, final Square pS2, final Engine pEngine) {
    return TCWestWithEmptyMarksMatch.newMatch(pS1, pS2, pEngine);
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfs1(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_S1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs1() {
    return rawAccumulateAllValuesOfs1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs1(final TCWestWithEmptyMarksMatch partialMatch) {
    return rawAccumulateAllValuesOfs1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs1(final Square pS2, final Engine pEngine) {
    return rawAccumulateAllValuesOfs1(new Object[]{
    null, 
    pS2, 
    pEngine
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfs2(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_S2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs2() {
    return rawAccumulateAllValuesOfs2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs2(final TCWestWithEmptyMarksMatch partialMatch) {
    return rawAccumulateAllValuesOfs2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs2(final Square pS1, final Engine pEngine) {
    return rawAccumulateAllValuesOfs2(new Object[]{
    pS1, 
    null, 
    pEngine
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Engine> rawAccumulateAllValuesOfengine(final Object[] parameters) {
    Set<Engine> results = new HashSet<Engine>();
    rawAccumulateAllValues(POSITION_ENGINE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine() {
    return rawAccumulateAllValuesOfengine(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine(final TCWestWithEmptyMarksMatch partialMatch) {
    return rawAccumulateAllValuesOfengine(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine(final Square pS1, final Square pS2) {
    return rawAccumulateAllValuesOfengine(new Object[]{
    pS1, 
    pS2, 
    null
    });
  }
  
  @Override
  protected TCWestWithEmptyMarksMatch tupleToMatch(final Tuple t) {
    try {
    	return TCWestWithEmptyMarksMatch.newMatch((Square) t.get(POSITION_S1), (Square) t.get(POSITION_S2), (Engine) t.get(POSITION_ENGINE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TCWestWithEmptyMarksMatch arrayToMatch(final Object[] match) {
    try {
    	return TCWestWithEmptyMarksMatch.newMatch((Square) match[POSITION_S1], (Square) match[POSITION_S2], (Engine) match[POSITION_ENGINE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TCWestWithEmptyMarksMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TCWestWithEmptyMarksMatch.newMutableMatch((Square) match[POSITION_S1], (Square) match[POSITION_S2], (Engine) match[POSITION_ENGINE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<TCWestWithEmptyMarksMatcher> querySpecification() throws ViatraQueryException {
    return TCWestWithEmptyMarksQuerySpecification.instance();
  }
}
