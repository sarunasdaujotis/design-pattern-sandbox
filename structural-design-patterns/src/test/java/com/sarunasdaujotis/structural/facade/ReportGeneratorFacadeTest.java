package com.sarunasdaujotis.structural.facade;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ReportGeneratorFacadeTest {

	@Mock
	private DocReportImpl docReport;

	@Mock
	private PdfReportImpl pdfReport;

	private ReportGeneratorFacade generatorFacade;

	@Before
	public void setUp() {
		generatorFacade = new ReportGeneratorFacade(pdfReport, docReport);
	}

	@Test
	public void testPdfGenerator() {
		generatorFacade.generate(ReportType.PDF);
		verify(pdfReport).generate();
	}

	@Test
	public void testDocGenerator() {
		generatorFacade.generate(ReportType.DOC);
		verify(docReport).generate();
	}
}