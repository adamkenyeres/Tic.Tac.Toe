/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.SouthEastMatch;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.SouthEast pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SouthEastProcessor implements IMatchProcessor<SouthEastMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquareN the value of pattern parameter squareN in the currently processed match
   * @param pSquareS the value of pattern parameter squareS in the currently processed match
   * @param pEngine the value of pattern parameter engine in the currently processed match
   * 
   */
  public abstract void process(final Square pSquareN, final Square pSquareS, final Engine pEngine);
  
  @Override
  public void process(final SouthEastMatch match) {
    process(match.getSquareN(), match.getSquareS(), match.getEngine());
  }
}
