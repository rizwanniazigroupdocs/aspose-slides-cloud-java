package com.aspose.cloud.examples.notesshapes;

import java.io.File;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.NotesSlideShapesApi;
import com.aspose.slides.model.ParagraphListResponse;
import com.aspose.slides.model.ParagraphResponse;
import com.aspose.slides.model.PortionListResponse;
import com.aspose.slides.model.PortionResponse;
import com.aspose.slides.model.ShapeExportFormat;
import com.aspose.slides.model.ShapeListResponse;
import com.aspose.slides.model.ShapeResponse;
import com.aspose.slides.model.request.DeleteNotesSlideParagraphRequest;
import com.aspose.slides.model.request.DeleteNotesSlideParagraphsRequest;
import com.aspose.slides.model.request.DeleteNotesSlidePortionsRequest;
import com.aspose.slides.model.request.DeleteNotesSlideShapeRequest;
import com.aspose.slides.model.request.DeleteNotesSlideShapesRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeParagraphRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeParagraphsRequest;
import com.aspose.slides.model.request.GetNotesSlideShapePortionRequest;
import com.aspose.slides.model.request.GetNotesSlideShapePortionsRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeWithFormatRequest;
import com.aspose.slides.model.request.GetNotesSlideShapesRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewPortionRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewShapeRequest;

public class NotesShapesExample {

	NotesSlideShapesApi api;

	public NotesShapesExample() {
		api = new NotesSlideShapesApi(AppSID, SecretKey);
	}


	final static String AppSID = "";
	final static String SecretKey = "";

	private DeleteNotesSlideParagraphRequest createDeleteNotesSlideParagraphRequest() {
		DeleteNotesSlideParagraphRequest request = new DeleteNotesSlideParagraphRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(1);
		request.setParagraphIndex(1);

		return request;
	}

	private DeleteNotesSlideParagraphsRequest createDeleteNotesSlideParagraphsRequest() {
		DeleteNotesSlideParagraphsRequest request = new DeleteNotesSlideParagraphsRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(1);
		return request;
	}

	private DeleteNotesSlidePortionsRequest createDeleteNotesSlidePortionsRequest() {
		DeleteNotesSlidePortionsRequest request = new DeleteNotesSlidePortionsRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(1);
		return request;
	}

	private DeleteNotesSlideShapeRequest createDeleteNotesSlideShapeRequest() {
		DeleteNotesSlideShapeRequest request = new DeleteNotesSlideShapeRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(1);
		return request;
	}

	private DeleteNotesSlideShapesRequest createDeleteNotesSlideShapesRequest() {
		DeleteNotesSlideShapesRequest request = new DeleteNotesSlideShapesRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		return request;
	}

	private GetNotesSlideShapeRequest createGetNotesSlideShapeRequest() {
		GetNotesSlideShapeRequest request = new GetNotesSlideShapeRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		return request;
	}

	private GetNotesSlideShapeParagraphRequest createGetNotesSlideShapeParagraphRequest() {
		GetNotesSlideShapeParagraphRequest request = new GetNotesSlideShapeParagraphRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(0);
		request.setParagraphIndex(1);

		return request;
	}

	private GetNotesSlideShapeParagraphsRequest createGetNotesSlideShapeParagraphsRequest() {
		GetNotesSlideShapeParagraphsRequest request = new GetNotesSlideShapeParagraphsRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(0);
		return request;
	}

	private GetNotesSlideShapePortionRequest createGetNotesSlideShapePortionRequest() {
		GetNotesSlideShapePortionRequest request = new GetNotesSlideShapePortionRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(0);
		request.setParagraphIndex(1);

		return request;
	}

	private GetNotesSlideShapePortionsRequest createGetNotesSlideShapePortionsRequest() {
		GetNotesSlideShapePortionsRequest request = new GetNotesSlideShapePortionsRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(0);
		request.setParagraphIndex(1);
		return request;
	}

	private GetNotesSlideShapeWithFormatRequest createGetNotesSlideShapeWithFormatRequest() {
		GetNotesSlideShapeWithFormatRequest request = new GetNotesSlideShapeWithFormatRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(0);
		request.setFormat(ShapeExportFormat.JPEG);

		return request;
	}

	private GetNotesSlideShapesRequest createGetNotesSlideShapesRequest() {
		GetNotesSlideShapesRequest request = new GetNotesSlideShapesRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);

		return request;
	}

	private PostNotesSlideAddNewPortionRequest createPostNotesSlideAddNewPortionRequest() {
		PostNotesSlideAddNewPortionRequest request = new PostNotesSlideAddNewPortionRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		request.setShapeIndex(1);
		request.setParagraphIndex(1);
		return request;
	}
	
	private PostNotesSlideAddNewShapeRequest createPostNotesSlideAddNewShapeRequest() {
        PostNotesSlideAddNewShapeRequest request = new PostNotesSlideAddNewShapeRequest();
        request.setName("test.pptx");
		request.setSlideIndex(1);
        request.setPosition(0);
        return request;
    }
    

	public void deleteNotesSlideParagraphExample() throws ApiException, Exception {

		ParagraphListResponse response = null;
		try {
			DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
			response = api.deleteNotesSlideParagraph(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void deleteNotesSlideParagraphsExample() throws ApiException, Exception {
		ParagraphListResponse response = null;
		try {
			DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
			response = api.deleteNotesSlideParagraphs(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void deleteNotesSlidePortionsExample() throws ApiException, Exception {
		PortionListResponse response = null;
		try {
			DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
			response = api.deleteNotesSlidePortions(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void deleteNotesSlideShapeExample() throws ApiException, Exception {
		ShapeListResponse response = null;
		;
		try {
			DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
			response = api.deleteNotesSlideShape(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void deleteNotesSlideShapesExample() throws ApiException, Exception {
		ShapeListResponse response = null;
		try {
			DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
			response = api.deleteNotesSlideShapes(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void getNotesSlideShapeExample() throws ApiException, Exception {
		ShapeResponse response = null;
		try {
			GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
			response = api.getNotesSlideShape(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getNotesSlideShapeParagraphExample() throws ApiException, Exception {
		ParagraphResponse response = null;
		try {
			GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
			response = api.getNotesSlideShapeParagraph(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getNotesSlideShapeParagraphsExample() throws ApiException, Exception {
		ParagraphListResponse response = null;
		try {
			GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
			response = api.getNotesSlideShapeParagraphs(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getNotesSlideShapePortionExample() throws ApiException, Exception {
		PortionResponse response = null;
		try {
			GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
			response = api.getNotesSlideShapePortion(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void getNotesSlideShapePortionsExample() throws ApiException, Exception {
		PortionListResponse response = null;
		try {
			GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
			response = api.getNotesSlideShapePortions(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void getNotesSlideShapeWithFormatTest() throws ApiException, Exception {
		File response = null;

		try {
			GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
			response = api.getNotesSlideShapeWithFormat(request);
			System.out.println(response.getAbsolutePath());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getNotesSlideShapesTest() throws ApiException, Exception {
		ShapeListResponse response = null;

		try {
			GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
			response = api.getNotesSlideShapes(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void postNotesSlideAddNewPortionTest() throws ApiException, Exception {
		PortionResponse response = null;
		try {
			PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
			response = api.postNotesSlideAddNewPortion(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	
	
	
	
	
	
	 public void postNotesSlideAddNewShapeTest() throws ApiException, Exception {
	        Boolean needAssertResponse = false;
	        ShapeResponse response = null;;
	        try {
	            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
	            response = api.postNotesSlideAddNewShape(request);
				System.out.println(response.getCode());

	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        }

	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

	}

}
