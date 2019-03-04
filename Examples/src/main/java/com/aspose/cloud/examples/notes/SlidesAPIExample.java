package com.aspose.cloud.examples.notes;

import java.io.File;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.NotesSlideApi;
import com.aspose.slides.model.NotesSlide;
import com.aspose.slides.model.NotesSlideExportFormat;
import com.aspose.slides.model.NotesSlideResponse;
import com.aspose.slides.model.SlideResponse;
import com.aspose.slides.model.request.DeleteNotesSlideRequest;
import com.aspose.slides.model.request.GetNotesSlideRequest;
import com.aspose.slides.model.request.GetNotesSlideWithFormatRequest;
import com.aspose.slides.model.request.PostAddNotesSlideRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideRequest;

public class SlidesAPIExample {
	NotesSlideApi api;

	public SlidesAPIExample() {
		api = new NotesSlideApi(AppSID, SecretKey);
	}

	final static String AppSID = "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9";
	final static String SecretKey = "b125f13bf6b76ed81ee990142d841195";

	private DeleteNotesSlideRequest createDeleteNotesSlideRequest() {
		DeleteNotesSlideRequest request = new DeleteNotesSlideRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);

		return request;
	}

	private GetNotesSlideRequest createGetNotesSlideRequest() {
		GetNotesSlideRequest request = new GetNotesSlideRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		return request;
	}

	private GetNotesSlideWithFormatRequest createGetNotesSlideWithFormatRequest() {
		GetNotesSlideWithFormatRequest request = new GetNotesSlideWithFormatRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setFormat(NotesSlideExportFormat.JPEG);

		return request;
	}

	private PostAddNotesSlideRequest createPostAddNotesSlideRequest() {
		PostAddNotesSlideRequest request = new PostAddNotesSlideRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);

		NotesSlide slide = new NotesSlide();
		slide.setText("Hello World");

		request.setDto(slide);

		return request;
	}

	private PutUpdateNotesSlideRequest createPutUpdateNotesSlideRequest() {
		PutUpdateNotesSlideRequest request = new PutUpdateNotesSlideRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);

		NotesSlide slide = new NotesSlide();
		slide.setText("Hello World");

		request.setDto(slide);
		return request;
	}

	public void deleteNotesSlideExample() throws ApiException, Exception {
		SlideResponse response = null;
		try {
			DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
			response = api.deleteNotesSlide(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void getNotesSlideExample() throws ApiException, Exception {
		NotesSlideResponse response = null;
		try {
			GetNotesSlideRequest request = createGetNotesSlideRequest();
			response = api.getNotesSlide(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void getNotesSlideWithFormatExample() throws ApiException, Exception {
		File response = null;
		try {
			GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
			response = api.getNotesSlideWithFormat(request);
			System.out.println(response.getAbsolutePath());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void postAddNotesSlideExample() throws ApiException, Exception {
		NotesSlideResponse response = null;
		try {
			PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
			response = api.postAddNotesSlide(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void putUpdateNotesSlideExample() throws ApiException, Exception {
		NotesSlideResponse response = null;
		try {
			PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
			response = api.putUpdateNotesSlide(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) {

	}

}
