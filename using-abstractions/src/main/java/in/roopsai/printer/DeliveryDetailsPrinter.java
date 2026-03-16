package in.roopsai.printer;

import in.roopsai.sorter.Sorter;

public class DeliveryDetailsPrinter {

    private Sorter sorter;

    public DeliveryDetailsPrinter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sortDetails() {
        sorter.sortDetails();
    }
}
