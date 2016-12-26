/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TransitiveClosure.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.TCSouthWithSameMarksMatch;
import tictactoe.Color;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.TCSouthWithSameMarks pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TCSouthWithSameMarksProcessor implements IMatchProcessor<TCSouthWithSameMarksMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pS1 the value of pattern parameter s1 in the currently processed match
   * @param pS2 the value of pattern parameter s2 in the currently processed match
   * @param pColor the value of pattern parameter color in the currently processed match
   * 
   */
  public abstract void process(final Square pS1, final Square pS2, final Color pColor);
  
  @Override
  public void process(final TCSouthWithSameMarksMatch match) {
    process(match.getS1(), match.getS2(), match.getColor());
  }
}
