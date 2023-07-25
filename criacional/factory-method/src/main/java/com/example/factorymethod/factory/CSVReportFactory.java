package com.example.factorymethod.factory;

import com.example.factorymethod.report.CSVReport;
import com.example.factorymethod.report.Report;
import org.springframework.stereotype.Component;

@Component
public class CSVReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new CSVReport();
    }
}
