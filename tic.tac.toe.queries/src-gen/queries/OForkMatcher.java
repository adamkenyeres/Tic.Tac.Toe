/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/ForkO.vql
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
import queries.OForkMatch;
import queries.util.OForkQuerySpecification;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.OFork pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link OForkMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern OFork(square : Square, engine : Engine) {
 * 	Engine.square(engine, square);
 * 	neg find markOnSquare(_, square, engine);
 * 
 * 	cntXNorth == count find TCNorthWithSameMarks(square, _, colorX);
 * 	cntXSouth == count find TCSouthWithSameMarks(square, _, colorX);
 * 	cntXEast == count find TCEastWithSameMarks(square, _, colorX);
 * 	cntXWest == count find TCWestWithSameMarks(square, _, colorX);
 * 	Engine.blackPlayer(engine, black);
 * 	Player.marks(black, markX);
 * 	Mark.color(markX, colorX);
 * 
 * 	cntNorthSquares == count find TCNorth(square, _);
 * 	cntSouthSquares == count find TCSouth(square, _);
 * 	cntEastSquares == count find TCEast(square, _);
 * 	cntWestSquares == count find TCWest(square, _);
 * 	check(cntNorthSquares + cntSouthSquares == 2);
 * 	check(cntEastSquares + cntWestSquares == 2);
 * 
 * 	cntONorth == count find TCNorthWithSameMarks(square, _, colorO);
 * 	cntOSouth == count find TCSouthWithSameMarks(square, _, colorO);
 * 	cntOEast == count find TCEastWithSameMarks(square, _, colorO);
 * 	cntOWest == count find TCWestWithSameMarks(square, _, colorO);
 * 	Engine.whitePlayer(engine, white);
 * 	Player.marks(white, markO);
 * 	Mark.color(markO, colorO);
 * 
 * 	check(cntXNorth + cntXSouth == 0);
 * 	check(cntONorth + cntOSouth {@literal >}= 1);
 * 	check(cntXEast + cntXWest == 0);
 * 	check(cntOEast + cntOWest {@literal >}= 1);
 * 
 * } or {
 * 	Engine.square(engine, square);
 * 	neg find markOnSquare(_, square, engine);
 * 
 * 	cntXNorth == count find TCNorthWithSameMarks(square, _, colorX);
 * 	cntXSouth == count find TCSouthWithSameMarks(square, _, colorX);
 * 	cntXNW == count find TCNorthWestWithSameMarks(square, _, colorX);
 * 	cntXSE == count find TCSouthEastWithSameMarks(square, _, colorX);
 * 
 * 	cntNorthSquares == count find TCNorth(square, _);
 * 	cntSouthSquares == count find TCSouth(square, _);
 * 	cntNWSquares == count find TCNorhtWest(square, _);
 * 	cntSESquares == count find TCSouthEast(square, _);
 * 	check(cntNorthSquares + cntSouthSquares == 2);
 * 	check(cntNWSquares + cntSESquares == 2);
 * 
 * 	Engine.blackPlayer(engine, black);
 * 	Player.marks(black, markX);
 * 	Mark.color(markX, colorX);
 * 
 * 	cntONorth == count find TCNorthWithSameMarks(square, _, colorO);
 * 	cntOSouth == count find TCSouthWithSameMarks(square, _, colorO);
 * 	cntONW == count find TCNorthWestWithSameMarks(square, _, colorO);
 * 	cntOSE == count find TCSouthEastWithSameMarks(square, _, colorO);
 * 	Engine.whitePlayer(engine, white);
 * 	Player.marks(white, markO);
 * 	Mark.color(markO, colorO);
 * 
 * 	check(cntXNorth + cntXSouth == 0);
 * 	check(cntXNW + cntXSE == 0);
 * 	check(cntONW + cntOSE {@literal >} 0);
 * 	check(cntONorth + cntOSouth {@literal >} 0);
 * } or {
 * 	Engine.square(engine, square);
 * 	neg find markOnSquare(_, square, engine);
 * 	cntXNorth == count find TCNorthWithSameMarks(square, _, colorX);
 * 	cntXSouth == count find TCSouthWithSameMarks(square, _, colorX);
 * 	cntXNE == count find TCNorthEastWithSameMarks(square, _, colorX);
 * 	cntXSW == count find TCSouthWestWithSameMarks(square, _, colorX);
 * 
 * 	cntNorthSquares == count find TCNorth(square, _);
 * 	cntSouthSquares == count find TCSouth(square, _);
 * 	cntNEquares == count find TCNorthEast(square, _);
 * 	cntSWSquares == count find TCSouthWest(square, _);
 * 	check(cntNorthSquares + cntSouthSquares == 2);
 * 	check(cntNEquares + cntSWSquares == 2);
 * 
 * 	Engine.blackPlayer(engine, black);
 * 	Player.marks(black, markX);
 * 	Mark.color(markX, colorX);
 * 
 * 	cntONorth == count find TCNorthWithSameMarks(square, _, colorO);
 * 	cntOSouth == count find TCSouthWithSameMarks(square, _, colorO);
 * 	cntONE == count find TCNorthEastWithSameMarks(square, _, colorO);
 * 	cntOSW == count find TCSouthWestWithSameMarks(square, _, colorO);
 * 	Engine.whitePlayer(engine, white);
 * 	Player.marks(white, markO);
 * 	Mark.color(markO, colorO);
 * 
 * 	check(cntXNorth + cntXSouth == 0);
 * 	check(cntXNE + cntXSW == 0);
 * 	check(cntONE + cntOSW {@literal >} 0);
 * 	check(cntONorth + cntOSouth {@literal >} 0);
 * } or {
 * 	Engine.square(engine, square);
 * 	neg find markOnSquare(_, square, engine);
 * 	cntXWest == count find TCWestWithSameMarks(square, _, colorX);
 * 	cntXEast == count find TCEastWithSameMarks(square, _, colorX);
 * 	cntXNE == count find TCNorthEastWithSameMarks(square, _, colorX);
 * 	cntXSW == count find TCSouthWestWithSameMarks(square, _, colorX);
 * 
 * 	cntWestSquares == count find TCWest(square, _);
 * 	cntEastSquares == count find TCEast(square, _);
 * 	cntNEquares == count find TCNorthEast(square, _);
 * 	cntSWSquares == count find TCSouthWest(square, _);
 * 	check(cntWestSquares + cntEastSquares == 2);
 * 	check(cntNEquares + cntSWSquares == 2);
 * 
 * 	Engine.blackPlayer(engine, black);
 * 	Player.marks(black, markX);
 * 	Mark.color(markX, colorX);
 * 
 * 	cntOWest == count find TCNorthWithSameMarks(square, _, colorO);
 * 	cntOEast == count find TCSouthWithSameMarks(square, _, colorO);
 * 	cntONE == count find TCNorthEastWithSameMarks(square, _, colorO);
 * 	cntOSW == count find TCSouthWestWithSameMarks(square, _, colorO);
 * 	Engine.whitePlayer(engine, white);
 * 	Player.marks(white, markO);
 * 	Mark.color(markO, colorO);
 * 
 * 	check(cntXWest + cntXEast == 0);
 * 	check(cntXNE + cntXSW == 0);
 * 	check(cntONE + cntOSW {@literal >} 0);
 * 	check(cntOEast + cntOWest {@literal >} 0);
 * } or {
 * 	Engine.square(engine, square);
 * 	neg find markOnSquare(_, square, engine);
 * 	cntXWest == count find TCWestWithSameMarks(square, _, colorX);
 * 	cntXEast == count find TCEastWithSameMarks(square, _, colorX);
 * 	cntXNW == count find TCNorthWestWithSameMarks(square, _, colorX);
 * 	cntXSE == count find TCSouthEastWithSameMarks(square, _, colorX);
 * 
 * 	cntWestSquares == count find TCWest(square, _);
 * 	cntEastSquares == count find TCEast(square, _);
 * 	cntNWSquares == count find TCNorhtWest(square, _);
 * 	cntSESquares == count find TCSouthEast(square, _);
 * 	check(cntWestSquares + cntEastSquares == 2);
 * 	check(cntNWSquares + cntSESquares == 2);
 * 
 * 	Engine.blackPlayer(engine, black);
 * 	Player.marks(black, markX);
 * 	Mark.color(markX, colorX);
 * 
 * 	cntOWest == count find TCNorthWithSameMarks(square, _, colorO);
 * 	cntOEast == count find TCSouthWithSameMarks(square, _, colorO);
 * 	cntONW == count find TCNorthWestWithSameMarks(square, _, colorO);
 * 	cntOSE == count find TCSouthEastWithSameMarks(square, _, colorO);
 * 	Engine.whitePlayer(engine, white);
 * 	Player.marks(white, markO);
 * 	Mark.color(markO, colorO);
 * 
 * 	check(cntXWest + cntXEast == 0);
 * 	check(cntXNW + cntXSE == 0);
 * 	check(cntONW + cntOSE {@literal >}= 1);
 * 	check(cntOEast + cntOWest {@literal >}= 1);
 * }
 * </pre></code>
 * 
 * @see OForkMatch
 * @see OForkProcessor
 * @see OForkQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class OForkMatcher extends BaseMatcher<OForkMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static OForkMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    OForkMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (OForkMatcher)engine.getMatcher(querySpecification());
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
  public static OForkMatcher create() throws ViatraQueryException {
    return new OForkMatcher();
  }
  
  private final static int POSITION_SQUARE = 0;
  
  private final static int POSITION_ENGINE = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(OForkMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private OForkMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return matches represented as a OForkMatch object.
   * 
   */
  public Collection<OForkMatch> getAllMatches(final Square pSquare, final Engine pEngine) {
    return rawGetAllMatches(new Object[]{pSquare, pEngine});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return a match represented as a OForkMatch object, or null if no match is found.
   * 
   */
  public OForkMatch getOneArbitraryMatch(final Square pSquare, final Engine pEngine) {
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
  public void forEachMatch(final Square pSquare, final Engine pEngine, final IMatchProcessor<? super OForkMatch> processor) {
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
  public boolean forOneArbitraryMatch(final Square pSquare, final Engine pEngine, final IMatchProcessor<? super OForkMatch> processor) {
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
  public OForkMatch newMatch(final Square pSquare, final Engine pEngine) {
    return OForkMatch.newMatch(pSquare, pEngine);
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
  public Set<Square> getAllValuesOfsquare(final OForkMatch partialMatch) {
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
  public Set<Engine> getAllValuesOfengine(final OForkMatch partialMatch) {
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
  protected OForkMatch tupleToMatch(final Tuple t) {
    try {
    	return OForkMatch.newMatch((Square) t.get(POSITION_SQUARE), (Engine) t.get(POSITION_ENGINE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OForkMatch arrayToMatch(final Object[] match) {
    try {
    	return OForkMatch.newMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OForkMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return OForkMatch.newMutableMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE]);
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
  public static IQuerySpecification<OForkMatcher> querySpecification() throws ViatraQueryException {
    return OForkQuerySpecification.instance();
  }
}
