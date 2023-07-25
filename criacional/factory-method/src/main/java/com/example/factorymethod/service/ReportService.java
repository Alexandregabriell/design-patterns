package com.example.factorymethod.service;

import com.example.factorymethod.factory.ReportFactory;
import com.example.factorymethod.report.Report;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    private final ReportFactory reportFactory;

    public ReportService(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public void generateReport() {
        Report report = reportFactory.createReport();
        report.generate();
    }
}
