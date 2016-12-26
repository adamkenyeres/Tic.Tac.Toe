/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/BasicRules.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.EmptySidesMatch;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.emptySides pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EmptySidesProcessor implements IMatchProcessor<EmptySidesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pEngine the value of pattern parameter engine in the currently processed match
   * 
   */
  public abstract void process(final Square pSquare, final Engine pEngine);
  
  @Override
  public void process(final EmptySidesMatch match) {
    process(match.getSquare(), match.getEngine());
  }
}
