package com.example.factorymethod.report;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CSVReport implements Report {
    @Override
    public void generate() {
        log.info("Generating report in CSV...");
    }
}
