/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.EastMatch;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.East pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EastProcessor implements IMatchProcessor<EastMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquareW the value of pattern parameter squareW in the currently processed match
   * @param pSquareE the value of pattern parameter squareE in the currently processed match
   * @param pEngine the value of pattern parameter engine in the currently processed match
   * 
   */
  public abstract void process(final Square pSquareW, final Square pSquareE, final Engine pEngine);
  
  @Override
  public void process(final EastMatch match) {
    process(match.getSquareW(), match.getSquareE(), match.getEngine());
  }
}
