/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TwoMovesFromWinning.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.PreventXForkByForcingWinMatch;
import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.preventXForkByForcingWin pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PreventXForkByForcingWinProcessor implements IMatchProcessor<PreventXForkByForcingWinMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pEngine the value of pattern parameter engine in the currently processed match
   * @param pColor the value of pattern parameter color in the currently processed match
   * 
   */
  public abstract void process(final Square pSquare, final Engine pEngine, final Color pColor);
  
  @Override
  public void process(final PreventXForkByForcingWinMatch match) {
    process(match.getSquare(), match.getEngine(), match.getColor());
  }
}
