/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.MarkOnSquareMatch;
import tictactoe.Engine;
import tictactoe.Mark;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.markOnSquare pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MarkOnSquareProcessor implements IMatchProcessor<MarkOnSquareMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMark the value of pattern parameter mark in the currently processed match
   * @param pSquare the value of pattern parameter square in the currently processed match
   * @param pEngine the value of pattern parameter engine in the currently processed match
   * 
   */
  public abstract void process(final Mark pMark, final Square pSquare, final Engine pEngine);
  
  @Override
  public void process(final MarkOnSquareMatch match) {
    process(match.getMark(), match.getSquare(), match.getEngine());
  }
}
