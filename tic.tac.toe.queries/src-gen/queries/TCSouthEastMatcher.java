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
import queries.TCSouthEastMatch;
import queries.util.TCSouthEastQuerySpecification;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.TCSouthEast pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TCSouthEastMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern TCSouthEast(s1 : Square, s2 : Square) {
 * 	find SE +(s1, s2);
 * }
 * </pre></code>
 * 
 * @see TCSouthEastMatch
 * @see TCSouthEastProcessor
 * @see TCSouthEastQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TCSouthEastMatcher extends BaseMatcher<TCSouthEastMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TCSouthEastMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TCSouthEastMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (TCSouthEastMatcher)engine.getMatcher(querySpecification());
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
  public static TCSouthEastMatcher create() throws ViatraQueryException {
    return new TCSouthEastMatcher();
  }
  
  private final static int POSITION_S1 = 0;
  
  private final static int POSITION_S2 = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TCSouthEastMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TCSouthEastMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return matches represented as a TCSouthEastMatch object.
   * 
   */
  public Collection<TCSouthEastMatch> getAllMatches(final Square pS1, final Square pS2) {
    return rawGetAllMatches(new Object[]{pS1, pS2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return a match represented as a TCSouthEastMatch object, or null if no match is found.
   * 
   */
  public TCSouthEastMatch getOneArbitraryMatch(final Square pS1, final Square pS2) {
    return rawGetOneArbitraryMatch(new Object[]{pS1, pS2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pS1, final Square pS2) {
    return rawHasMatch(new Object[]{pS1, pS2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pS1, final Square pS2) {
    return rawCountMatches(new Object[]{pS1, pS2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pS1, final Square pS2, final IMatchProcessor<? super TCSouthEastMatch> processor) {
    rawForEachMatch(new Object[]{pS1, pS2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pS1, final Square pS2, final IMatchProcessor<? super TCSouthEastMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS1, pS2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TCSouthEastMatch newMatch(final Square pS1, final Square pS2) {
    return TCSouthEastMatch.newMatch(pS1, pS2);
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
  public Set<Square> getAllValuesOfs1(final TCSouthEastMatch partialMatch) {
    return rawAccumulateAllValuesOfs1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs1(final Square pS2) {
    return rawAccumulateAllValuesOfs1(new Object[]{
    null, 
    pS2
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
  public Set<Square> getAllValuesOfs2(final TCSouthEastMatch partialMatch) {
    return rawAccumulateAllValuesOfs2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs2(final Square pS1) {
    return rawAccumulateAllValuesOfs2(new Object[]{
    pS1, 
    null
    });
  }
  
  @Override
  protected TCSouthEastMatch tupleToMatch(final Tuple t) {
    try {
    	return TCSouthEastMatch.newMatch((Square) t.get(POSITION_S1), (Square) t.get(POSITION_S2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TCSouthEastMatch arrayToMatch(final Object[] match) {
    try {
    	return TCSouthEastMatch.newMatch((Square) match[POSITION_S1], (Square) match[POSITION_S2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TCSouthEastMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TCSouthEastMatch.newMutableMatch((Square) match[POSITION_S1], (Square) match[POSITION_S2]);
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
  public static IQuerySpecification<TCSouthEastMatcher> querySpecification() throws ViatraQueryException {
    return TCSouthEastQuerySpecification.instance();
  }
}
