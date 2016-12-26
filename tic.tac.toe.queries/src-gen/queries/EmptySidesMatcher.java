/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/BasicRules.vql
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
import queries.EmptySidesMatch;
import queries.util.EmptySidesQuerySpecification;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.emptySides pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EmptySidesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern emptySides(square : Square, engine : Engine){
 * 	Engine.square(engine, square);
 * 	Square.pos_x(square, pos_x);
 * 	check(pos_x == 1 || pos_x == -1);
 * 	cntNorth == count find TCNorthWithEmptyMarks(square,_, engine);
 * 	cntSouth == count find TCSouthWithEmptyMarks(square,_, engine);
 * 	check(cntNorth + cntSouth == 3);
 * }or{
 * 	Engine.square(engine, square);
 * 	Square.pos_y(square, pos_y);
 * 	check(pos_y == 1 || pos_y == -1);
 * 	cntEast == count find TCEastWithEmptyMarks(square,_, engine);
 * 	cntWest == count find TCWestWithEmptyMarks(square,_, engine);
 * 	check(cntEast + cntWest == 3);
 * }
 * </pre></code>
 * 
 * @see EmptySidesMatch
 * @see EmptySidesProcessor
 * @see EmptySidesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EmptySidesMatcher extends BaseMatcher<EmptySidesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EmptySidesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    EmptySidesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (EmptySidesMatcher)engine.getMatcher(querySpecification());
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
  public static EmptySidesMatcher create() throws ViatraQueryException {
    return new EmptySidesMatcher();
  }
  
  private final static int POSITION_SQUARE = 0;
  
  private final static int POSITION_ENGINE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EmptySidesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private EmptySidesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return matches represented as a EmptySidesMatch object.
   * 
   */
  public Collection<EmptySidesMatch> getAllMatches(final Square pSquare, final Engine pEngine) {
    return rawGetAllMatches(new Object[]{pSquare, pEngine});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return a match represented as a EmptySidesMatch object, or null if no match is found.
   * 
   */
  public EmptySidesMatch getOneArbitraryMatch(final Square pSquare, final Engine pEngine) {
    return rawGetOneArbitraryMatch(new Object[]{pSquare, pEngine});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquare, final Engine pEngine) {
    return rawHasMatch(new Object[]{pSquare, pEngine});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquare, final Engine pEngine) {
    return rawCountMatches(new Object[]{pSquare, pEngine});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquare, final Engine pEngine, final IMatchProcessor<? super EmptySidesMatch> processor) {
    rawForEachMatch(new Object[]{pSquare, pEngine}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquare, final Engine pEngine, final IMatchProcessor<? super EmptySidesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquare, pEngine}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EmptySidesMatch newMatch(final Square pSquare, final Engine pEngine) {
    return EmptySidesMatch.newMatch(pSquare, pEngine);
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquare(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare() {
    return rawAccumulateAllValuesOfsquare(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final EmptySidesMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Engine pEngine) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
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
  public Set<Engine> getAllValuesOfengine(final EmptySidesMatch partialMatch) {
    return rawAccumulateAllValuesOfengine(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine(final Square pSquare) {
    return rawAccumulateAllValuesOfengine(new Object[]{
    pSquare, 
    null
    });
  }
  
  @Override
  protected EmptySidesMatch tupleToMatch(final Tuple t) {
    try {
    	return EmptySidesMatch.newMatch((Square) t.get(POSITION_SQUARE), (Engine) t.get(POSITION_ENGINE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptySidesMatch arrayToMatch(final Object[] match) {
    try {
    	return EmptySidesMatch.newMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptySidesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EmptySidesMatch.newMutableMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE]);
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
  public static IQuerySpecification<EmptySidesMatcher> querySpecification() throws ViatraQueryException {
    return EmptySidesQuerySpecification.instance();
  }
}
