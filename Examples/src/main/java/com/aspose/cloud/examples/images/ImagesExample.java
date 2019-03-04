package com.aspose.cloud.examples.images;

import java.io.File;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.ImagesApi;
import com.aspose.slides.model.ImageExportFormat;
import com.aspose.slides.model.ImagesResponse;
import com.aspose.slides.model.request.GetSlidesImageWithFormatRequest;
import com.aspose.slides.model.request.GetSlidesImagesRequest;

public class ImagesExample {
	ImagesApi api;

	public ImagesExample() {

		api = new ImagesApi(AppSID, SecretKey);
	}

	final static String AppSID = "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9";
	final static String SecretKey = "b125f13bf6b76ed81ee990142d841195";

	private GetSlidesImageWithFormatRequest createGetSlidesImageWithFormatRequest() {
		GetSlidesImageWithFormatRequest request = new GetSlidesImageWithFormatRequest();
		request.setName("test.pptx");
		request.setIndex(1);
		request.setFormat(ImageExportFormat.JPEG);
		return request;
	}

	private GetSlidesImagesRequest createGetSlidesImagesRequest() {
		GetSlidesImagesRequest request = new GetSlidesImagesRequest();
		request.setName("test.pptx");
		return request;
	}

	public void GetSlidesImageWithFormatExample() throws ApiException, Exception {

		File response = null;
		try {
			GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
			response = api.getSlidesImageWithFormat(request);
			System.out.println(response.getAbsolutePath());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void GetSlidesImagesTest() throws ApiException, Exception {
		ImagesResponse response = null;
		try {
			GetSlidesImagesRequest request = createGetSlidesImagesRequest();
			response = api.getSlidesImages(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) throws ApiException, Exception {
		new ImagesExample().GetSlidesImageWithFormatExample();
	}

}
