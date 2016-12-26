/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.NorthMatch;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.North pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NorthProcessor implements IMatchProcessor<NorthMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquareS the value of pattern parameter squareS in the currently processed match
   * @param pSquareN the value of pattern parameter squareN in the currently processed match
   * @param pEngine the value of pattern parameter engine in the currently processed match
   * 
   */
  public abstract void process(final Square pSquareS, final Square pSquareN, final Engine pEngine);
  
  @Override
  public void process(final NorthMatch match) {
    process(match.getSquareS(), match.getSquareN(), match.getEngine());
  }
}
