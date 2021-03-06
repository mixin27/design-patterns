package com.norm;

import com.norm.observer.Chart;
import com.norm.observer.DataSource;
import com.norm.observer.SpreadSheet;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadSheet1 = new SpreadSheet(dataSource);
        var spreadSheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(spreadSheet1);
        dataSource.addObserver(spreadSheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
        dataSource.setValue(10);
    }
}
