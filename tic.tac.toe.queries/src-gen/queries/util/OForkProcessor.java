/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/ForkO.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.OForkMatch;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.OFork pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class OForkProcessor implements IMatchProcessor<OForkMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pEngine the value of pattern parameter engine in the currently processed match
   * 
   */
  public abstract void process(final Square pSquare, final Engine pEngine);
  
  @Override
  public void process(final OForkMatch match) {
    process(match.getSquare(), match.getEngine());
  }
}
