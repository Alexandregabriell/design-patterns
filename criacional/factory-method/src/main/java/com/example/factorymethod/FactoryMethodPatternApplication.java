package com.example.factorymethod;

import com.example.factorymethod.factory.CSVReportFactory;
import com.example.factorymethod.factory.PDFReportFactory;
import com.example.factorymethod.factory.ReportFactory;
import com.example.factorymethod.service.ReportService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static com.example.factorymethod.enums.ReportType.*;

@SpringBootApplication
public class FactoryMethodPatternApplication {
    private ReportFactory reportFactory;

    public FactoryMethodPatternApplication(ReportFactory reportFactory, @Value("${report.type}") String reportType) {
        this.reportFactory = reportFactory;

        if (!isValidReportType(reportType)) {
            throw new IllegalArgumentException("Tipo de relatório inválido: " + reportType);
        }

        if (PDF.name().equalsIgnoreCase(reportType)) {
            this.reportFactory = new PDFReportFactory();
        } else if (CSV.name().equalsIgnoreCase(reportType)) {
            this.reportFactory = new CSVReportFactory();
        }
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(FactoryMethodPatternApplication.class, args);
        FactoryMethodPatternApplication application = applicationContext.getBean(FactoryMethodPatternApplication.class);
        application.run();
    }

    public void run() {
        ReportService reportService = new ReportService(reportFactory);
        reportService.generateReport();
    }

    private boolean isValidReportType(String reportType) {
        return PDF.name().equalsIgnoreCase(reportType) || CSV.name().equalsIgnoreCase(reportType);
    }
}
