package com.example.factorymethod.factory;

import com.example.factorymethod.report.PDFReport;
import com.example.factorymethod.report.Report;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PDFReportFactory implements ReportFactory {
    @Override
    public Report createReport() {
        return new PDFReport();
    }
}
