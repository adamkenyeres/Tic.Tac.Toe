/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.SquareMatch;
import tictactoe.Engine;
import tictactoe.Mark;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.square pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SquareProcessor implements IMatchProcessor<SquareMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * @param pEngine the value of pattern parameter engine in the currently processed match
   * 
   */
  public abstract void process(final Mark pSource, final Square pTarget, final Engine pEngine);
  
  @Override
  public void process(final SquareMatch match) {
    process(match.getSource(), match.getTarget(), match.getEngine());
  }
}
