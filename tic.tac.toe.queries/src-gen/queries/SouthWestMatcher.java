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
import queries.SouthWestMatch;
import queries.util.SouthWestQuerySpecification;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.SouthWest pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SouthWestMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern SouthWest(squareN : Square, squareS : Square, engine : Engine){
 * 	Engine.square(engine,squareN);
 * 	Engine.square(engine,squareS);
 * 	Square.pos_x(squareN,pos_N_x);
 * 	Square.pos_x(squareS,pos_S_x);
 * 	Square.pos_y(squareN, pos_N_y);
 * 	Square.pos_y(squareS, pos_S_y);
 * 	check(pos_N_y == pos_S_y + 1);
 * 	check(pos_N_x == pos_S_x + 1);
 * }
 * </pre></code>
 * 
 * @see SouthWestMatch
 * @see SouthWestProcessor
 * @see SouthWestQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SouthWestMatcher extends BaseMatcher<SouthWestMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SouthWestMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    SouthWestMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (SouthWestMatcher)engine.getMatcher(querySpecification());
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
  public static SouthWestMatcher create() throws ViatraQueryException {
    return new SouthWestMatcher();
  }
  
  private final static int POSITION_SQUAREN = 0;
  
  private final static int POSITION_SQUARES = 1;
  
  private final static int POSITION_ENGINE = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SouthWestMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private SouthWestMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return matches represented as a SouthWestMatch object.
   * 
   */
  public Collection<SouthWestMatch> getAllMatches(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
    return rawGetAllMatches(new Object[]{pSquareN, pSquareS, pEngine});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return a match represented as a SouthWestMatch object, or null if no match is found.
   * 
   */
  public SouthWestMatch getOneArbitraryMatch(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
    return rawGetOneArbitraryMatch(new Object[]{pSquareN, pSquareS, pEngine});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
    return rawHasMatch(new Object[]{pSquareN, pSquareS, pEngine});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
    return rawCountMatches(new Object[]{pSquareN, pSquareS, pEngine});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquareN, final Square pSquareS, final Engine pEngine, final IMatchProcessor<? super SouthWestMatch> processor) {
    rawForEachMatch(new Object[]{pSquareN, pSquareS, pEngine}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquareN, final Square pSquareS, final Engine pEngine, final IMatchProcessor<? super SouthWestMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquareN, pSquareS, pEngine}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SouthWestMatch newMatch(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
    return SouthWestMatch.newMatch(pSquareN, pSquareS, pEngine);
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
  public Set<Square> getAllValuesOfsquareN(final SouthWestMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareN(final Square pSquareS, final Engine pEngine) {
    return rawAccumulateAllValuesOfsquareN(new Object[]{
    null, 
    pSquareS, 
    pEngine
    });
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
  public Set<Square> getAllValuesOfsquareS(final SouthWestMatch partialMatch) {
    return rawAccumulateAllValuesOfsquareS(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for squareS.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquareS(final Square pSquareN, final Engine pEngine) {
    return rawAccumulateAllValuesOfsquareS(new Object[]{
    pSquareN, 
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
  public Set<Engine> getAllValuesOfengine(final SouthWestMatch partialMatch) {
    return rawAccumulateAllValuesOfengine(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine(final Square pSquareN, final Square pSquareS) {
    return rawAccumulateAllValuesOfengine(new Object[]{
    pSquareN, 
    pSquareS, 
    null
    });
  }
  
  @Override
  protected SouthWestMatch tupleToMatch(final Tuple t) {
    try {
    	return SouthWestMatch.newMatch((Square) t.get(POSITION_SQUAREN), (Square) t.get(POSITION_SQUARES), (Engine) t.get(POSITION_ENGINE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SouthWestMatch arrayToMatch(final Object[] match) {
    try {
    	return SouthWestMatch.newMatch((Square) match[POSITION_SQUAREN], (Square) match[POSITION_SQUARES], (Engine) match[POSITION_ENGINE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SouthWestMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SouthWestMatch.newMutableMatch((Square) match[POSITION_SQUAREN], (Square) match[POSITION_SQUARES], (Engine) match[POSITION_ENGINE]);
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
  public static IQuerySpecification<SouthWestMatcher> querySpecification() throws ViatraQueryException {
    return SouthWestQuerySpecification.instance();
  }
}
