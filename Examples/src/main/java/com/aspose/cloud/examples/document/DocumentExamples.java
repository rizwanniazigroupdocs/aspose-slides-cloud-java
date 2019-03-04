package com.aspose.cloud.examples.document;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.DocumentApi;
import com.aspose.slides.model.DocumentResponse;
import com.aspose.slides.model.ExportFormat;
import com.aspose.slides.model.ScaleType;
import com.aspose.slides.model.SizeType;
import com.aspose.slides.model.SlideExportFormat;
import com.aspose.slides.model.SplitDocumentResponse;
import com.aspose.slides.model.request.GetSlidesDocumentRequest;
import com.aspose.slides.model.request.GetSlidesDocumentWithFormatRequest;
import com.aspose.slides.model.request.PostSlidesDocumentRequest;
import com.aspose.slides.model.request.PostSlidesSaveAsRequest;
import com.aspose.slides.model.request.PostSlidesSplitRequest;
import com.aspose.slides.model.request.PutSlidesConvertRequest;
import com.aspose.slides.model.request.PutSlidesDocumentFromHtmlRequest;
import com.aspose.slides.model.request.PutSlidesSlideSizeRequest;

public class DocumentExamples {
	DocumentApi api;

	public DocumentExamples() {

		api = new DocumentApi(AppSID, SecretKey);
	}

	final static String AppSID = "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9";
	final static String SecretKey = "b125f13bf6b76ed81ee990142d841195";

	private static GetSlidesDocumentRequest createGetSlidesDocumentRequest() {
		GetSlidesDocumentRequest request = new GetSlidesDocumentRequest();
		request.setName("test.pptx");
		request.setPassword("");
		request.setStorage("");
		request.setFolder(null);
		return request;
	}

	private static GetSlidesDocumentWithFormatRequest createGetSlidesDocumentWithFormatRequest() {
		GetSlidesDocumentWithFormatRequest request = new GetSlidesDocumentWithFormatRequest();
		request.setName("test.pptx");
		request.setFormat(ExportFormat.PNG);
		request.setJpegQuality(100);

		return request;
	}

	private PostSlidesDocumentRequest createPostSlidesDocumentRequest() {
		PostSlidesDocumentRequest request = new PostSlidesDocumentRequest();
		request.setName("test1.pptx");
		request.setData("This is a test");
		request.setTemplatePath("");
		request.setIsImageDataEmbedded(false);
		return request;
	}

	private PostSlidesSaveAsRequest createPostSlidesSaveAsRequest() {
		PostSlidesSaveAsRequest request = new PostSlidesSaveAsRequest();
		request.setName("test.pptx");
		request.setFormat(ExportFormat.JPEG);

		return request;
	}

	private PostSlidesSplitRequest createPostSlidesSplitRequest() {
		PostSlidesSplitRequest request = new PostSlidesSplitRequest();
		request.setName("test.pptx");
		request.setFormat(SlideExportFormat.JPEG);

		return request;
	}
	private PutSlidesSlideSizeRequest createPutSlidesSlideSizeRequest() {
        PutSlidesSlideSizeRequest request = new PutSlidesSlideSizeRequest();
        request.setName("test.pptx");
        request.setSizeType(SizeType.A4PAPER);
        request.setScaleType(ScaleType.DONOTSCALE);
        return request;
    }
	private PutSlidesConvertRequest createPutSlidesConvertRequest() throws IOException {
		PutSlidesConvertRequest request = new PutSlidesConvertRequest();
		request.setFormat(ExportFormat.JPEG);

		File file = new File("C:\\Users\\mateen.SAJID\\Desktop\\test.pptx");
		byte[] bytesArray = new byte[(int) file.length()];

		FileInputStream fis = new FileInputStream(file);
		fis.read(bytesArray);

		request.setDocument(bytesArray);
		return request;
	}
	private PutSlidesDocumentFromHtmlRequest createPutSlidesDocumentFromHtmlRequest() {
        PutSlidesDocumentFromHtmlRequest request = new PutSlidesDocumentFromHtmlRequest();
        request.setName("test.pptx");
        request.setHtml("<html></html>");

        return request;
    }
	public void GetSlidesDocumentRequest() {
		DocumentResponse response = null;
		try {
			DocumentApi api = new DocumentApi(AppSID, SecretKey);
			GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
			response = api.getSlidesDocument(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void GetSlidesDocumentWithFormatTest() throws ApiException, Exception {
		File response = null;
		try {
			GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
			response = api.getSlidesDocumentWithFormat(request);
			System.out.println(response.getAbsolutePath());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void PostSlidesDocumentExample() throws ApiException, Exception {
		DocumentResponse response = null;
		try {
			PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
			response = api.postSlidesDocument(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void PostSlidesSaveAsExample() throws ApiException, Exception {
		File response = null;
		try {
			PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
			response = api.postSlidesSaveAs(request);
			System.out.println(response.getAbsolutePath());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void PostSlidesSplitExample() throws ApiException, Exception {
		SplitDocumentResponse response = null;
		;
		try {
			PostSlidesSplitRequest request = createPostSlidesSplitRequest();
			response = api.postSlidesSplit(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void PutSlidesConvertExample() throws ApiException, Exception {
		File response = null;
		;
		try {
			PutSlidesConvertRequest request = createPutSlidesConvertRequest();
			response = api.putSlidesConvert(request);
			System.out.println(response.getAbsolutePath());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void PutSlidesDocumentFromHtmlExample() throws ApiException, Exception {
        DocumentResponse response = null;
        try {
            PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
            response = api.putSlidesDocumentFromHtml(request);
			System.out.println(response.getCode());

        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
	
	public void PutSlidesSlideSizeExample() throws ApiException, Exception {
        DocumentResponse response = null;;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            response = api.putSlidesSlideSize(request);
			System.out.println(response.getCode());

        } catch (Exception ex) {
        	 ex.printStackTrace();
        }

    }

	
	
	
	public static void main(String[] argv) throws ApiException, Exception {

		new DocumentExamples().PutSlidesSlideSizeExample();
	}
}
