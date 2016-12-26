/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
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
import queries.NorthMatch;
import queries.util.NorthQuerySpecification;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.North pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NorthMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern North(squareS : Square, squareN : Square, engine : Engine){
 * 	Engine.square(engine,squareN);
 * 	Square.pos_x(squareN,pos_x);
 * 	Square.pos_x(squareS,pos_x);
 * 	Square.pos_y(squareS, pos_S_y);
 * 	Square.pos_y(squareN, pos_N_y);
 * 	check(pos_N_y == pos_S_y + 1);
 * }
 * </pre></code>
 * 
 * @see NorthMatch
 * @see NorthProcessor
 * @see NorthQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NorthMatcher extends BaseMatcher<NorthMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NorthMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    NorthMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (NorthMatcher)engine.getMatcher(querySpecification());
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
  public static NorthMatcher create() throws ViatraQueryException {
    return new NorthMatcher();
  }
  
  private final static int POSITION_SQUARES = 0;
  
  private final static int POSITION_SQUAREN = 1;
  
  private final static int POSITION_ENGINE = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NorthMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private NorthMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return matches represented as a NorthMatch object.
   * 
   */
  public Collection<NorthMatch> getAllMatches(final Square pSquareS, final Square pSquareN, final Engine pEngine) {
    return rawGetAllMatches(new Object[]{pSquareS, pSquareN, pEngine});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return a match represented as a NorthMatch object, or null if no match is found.
   * 
   */
  public NorthMatch getOneArbitraryMatch(final Square pSquareS, final Square pSquareN, final Engine pEngine) {
    return rawGetOneArbitraryMatch(new Object[]{pSquareS, pSquareN, pEngine});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquareS, final Square pSquareN, final Engine pEngine) {
    return rawHasMatch(new Object[]{pSquareS, pSquareN, pEngine});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquareS, final Square pSquareN, final Engine pEngine) {
    return rawCountMatches(new Object[]{pSquareS, pSquareN, pEngine});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquareS, final Square pSquareN, final Engine pEngine, final IMatchProcessor<? super NorthMatch> processor) {
    rawForEachMatch(new Object[]{pSquareS, pSquareN, pEngine}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquareS, final Square pSquareN, final Engine pEngine, final IMatchProcessor<? super NorthMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquareS, pSquareN, pEngine}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NorthMatch newMatch(final Square pSquareS, final Square pSquareN, final Engine pEngine) {
    return NorthMatch.newMatch(pSquareS, pSquareN, pEngine);
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareS.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareS(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARES, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareS.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareS() {
    return rawAccumulateAllValuesOfsquareS(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareS.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareS(final NorthMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareS.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareS(final Square pSquareN, final Engine pEngine) {
    return rawAccumulateAllValuesOfsquareS(new Object[]{
    null, 
    pSquareN, 
    pEngine
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquareN(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUAREN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareN() {
    return rawAccumulateAllValuesOfsquareN(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareN(final NorthMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareN(final Square pSquareS, final Engine pEngine) {
    return rawAccumulateAllValuesOfsquareN(new Object[]{
    pSquareS, 
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
  public Set<Engine> getAllValuesOfengine(final NorthMatch partialMatch) {
    return rawAccumulateAllValuesOfengine(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine(final Square pSquareS, final Square pSquareN) {
    return rawAccumulateAllValuesOfengine(new Object[]{
    pSquareS, 
    pSquareN, 
    null
    });
  }
  
  @Override
  protected NorthMatch tupleToMatch(final Tuple t) {
    try {
    	return NorthMatch.newMatch((Square) t.get(POSITION_SQUARES), (Square) t.get(POSITION_SQUAREN), (Engine) t.get(POSITION_ENGINE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NorthMatch arrayToMatch(final Object[] match) {
    try {
    	return NorthMatch.newMatch((Square) match[POSITION_SQUARES], (Square) match[POSITION_SQUAREN], (Engine) match[POSITION_ENGINE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NorthMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NorthMatch.newMutableMatch((Square) match[POSITION_SQUARES], (Square) match[POSITION_SQUAREN], (Engine) match[POSITION_ENGINE]);
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
  public static IQuerySpecification<NorthMatcher> querySpecification() throws ViatraQueryException {
    return NorthQuerySpecification.instance();
  }
}
