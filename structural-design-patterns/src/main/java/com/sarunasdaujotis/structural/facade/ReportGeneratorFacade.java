package com.sarunasdaujotis.structural.facade;

public class ReportGeneratorFacade {

	private Report pdfReport;
	private Report docReport;

	public ReportGeneratorFacade(final Report pdfReport, final Report docReport) {
		this.pdfReport = pdfReport;
		this.docReport = docReport;
	}

	public void generate(final ReportType reportType) {
		switch (reportType) {
		case DOC:
			docReport.generate();
			break;
		case PDF:
			pdfReport.generate();
			break;
		default:
			throw new IllegalArgumentException("Unknown report type!");
		}
	}
}
