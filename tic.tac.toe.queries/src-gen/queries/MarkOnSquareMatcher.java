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
import queries.MarkOnSquareMatch;
import queries.util.MarkOnSquareQuerySpecification;
import tictactoe.Engine;
import tictactoe.Mark;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.markOnSquare pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MarkOnSquareMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern markOnSquare(mark : Mark, square : Square, engine : Engine){
 * 	Engine.square(engine, square);
 * 	Square.pos_x(square, pos_x);
 * 	Square.pos_y(square, pos_y);
 * 	Mark.pos_x(mark, pos_x);
 * 	Mark.pos_y(mark, pos_y);
 * }
 * </pre></code>
 * 
 * @see MarkOnSquareMatch
 * @see MarkOnSquareProcessor
 * @see MarkOnSquareQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MarkOnSquareMatcher extends BaseMatcher<MarkOnSquareMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MarkOnSquareMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    MarkOnSquareMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (MarkOnSquareMatcher)engine.getMatcher(querySpecification());
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
  public static MarkOnSquareMatcher create() throws ViatraQueryException {
    return new MarkOnSquareMatcher();
  }
  
  private final static int POSITION_MARK = 0;
  
  private final static int POSITION_SQUARE = 1;
  
  private final static int POSITION_ENGINE = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MarkOnSquareMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private MarkOnSquareMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return matches represented as a MarkOnSquareMatch object.
   * 
   */
  public Collection<MarkOnSquareMatch> getAllMatches(final Mark pMark, final Square pSquare, final Engine pEngine) {
    return rawGetAllMatches(new Object[]{pMark, pSquare, pEngine});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return a match represented as a MarkOnSquareMatch object, or null if no match is found.
   * 
   */
  public MarkOnSquareMatch getOneArbitraryMatch(final Mark pMark, final Square pSquare, final Engine pEngine) {
    return rawGetOneArbitraryMatch(new Object[]{pMark, pSquare, pEngine});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Mark pMark, final Square pSquare, final Engine pEngine) {
    return rawHasMatch(new Object[]{pMark, pSquare, pEngine});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Mark pMark, final Square pSquare, final Engine pEngine) {
    return rawCountMatches(new Object[]{pMark, pSquare, pEngine});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Mark pMark, final Square pSquare, final Engine pEngine, final IMatchProcessor<? super MarkOnSquareMatch> processor) {
    rawForEachMatch(new Object[]{pMark, pSquare, pEngine}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Mark pMark, final Square pSquare, final Engine pEngine, final IMatchProcessor<? super MarkOnSquareMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMark, pSquare, pEngine}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MarkOnSquareMatch newMatch(final Mark pMark, final Square pSquare, final Engine pEngine) {
    return MarkOnSquareMatch.newMatch(pMark, pSquare, pEngine);
  }
  
  /**
   * Retrieve the set of values that occur in matches for mark.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Mark> rawAccumulateAllValuesOfmark(final Object[] parameters) {
    Set<Mark> results = new HashSet<Mark>();
    rawAccumulateAllValues(POSITION_MARK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for mark.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mark> getAllValuesOfmark() {
    return rawAccumulateAllValuesOfmark(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mark.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mark> getAllValuesOfmark(final MarkOnSquareMatch partialMatch) {
    return rawAccumulateAllValuesOfmark(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mark.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mark> getAllValuesOfmark(final Square pSquare, final Engine pEngine) {
    return rawAccumulateAllValuesOfmark(new Object[]{
    null, 
    pSquare, 
    pEngine
    });
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
  public Set<Square> getAllValuesOfsquare(final MarkOnSquareMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Mark pMark, final Engine pEngine) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    pMark, 
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
  public Set<Engine> getAllValuesOfengine(final MarkOnSquareMatch partialMatch) {
    return rawAccumulateAllValuesOfengine(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine(final Mark pMark, final Square pSquare) {
    return rawAccumulateAllValuesOfengine(new Object[]{
    pMark, 
    pSquare, 
    null
    });
  }
  
  @Override
  protected MarkOnSquareMatch tupleToMatch(final Tuple t) {
    try {
    	return MarkOnSquareMatch.newMatch((Mark) t.get(POSITION_MARK), (Square) t.get(POSITION_SQUARE), (Engine) t.get(POSITION_ENGINE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MarkOnSquareMatch arrayToMatch(final Object[] match) {
    try {
    	return MarkOnSquareMatch.newMatch((Mark) match[POSITION_MARK], (Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MarkOnSquareMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MarkOnSquareMatch.newMutableMatch((Mark) match[POSITION_MARK], (Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE]);
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
  public static IQuerySpecification<MarkOnSquareMatcher> querySpecification() throws ViatraQueryException {
    return MarkOnSquareQuerySpecification.instance();
  }
}
