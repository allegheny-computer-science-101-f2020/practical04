package practicalfour.experiment;

import practicalfour.data.ResultsTable;
import practicalfour.repeat.AppendRepeater;
import practicalfour.repeat.IterativeRepeater;

/**
 * An Experiment class that can run a campaign of experiments.
 *
 * @author Janyl Jumadinova
 */

public class Experiment {

  /** Run a Sorter in an experiment campaign. */
  public static void main(String[] args) {
    RunCampaign runSorterCampaign = new RunCampaign();
    // Create an AppendRepeater and run it in a campaign
    AppendRepeater appendRepeater = new AppendRepeater();
    ResultsTable appendRepeaterResultsTable = runSorterCampaign.run(appendRepeater);
    // TODO: Add the required labels before and after the experiment campaign
    System.out.println(appendRepeaterResultsTable.toString());
    System.out.println();
    // Create an IterativeRepeater and run it in a campaign
    IterativeRepeater iterativeRepeater = new IterativeRepeater();
    ResultsTable iterativeRepeaterResultsTable = runSorterCampaign.run(iterativeRepeater);
    System.out.println(iterativeRepeaterResultsTable.toString());
    // TODO: Make sure that your data tables contain the correct results
    // TODO: Make sure that you can interpret the output of the data tables
  }

}
