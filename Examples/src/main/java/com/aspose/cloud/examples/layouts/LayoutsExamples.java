package com.aspose.cloud.examples.layouts;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.LayoutSlidesApi;
import com.aspose.slides.model.LayoutSlide;
import com.aspose.slides.model.LayoutSlideListResponse;
import com.aspose.slides.model.LayoutSlideResponse;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ResourceUriElement;
import com.aspose.slides.model.request.GetLayoutSlideRequest;
import com.aspose.slides.model.request.GetLayoutSlidesListRequest;
import com.aspose.slides.model.request.PostCopyLayoutSlideFromSourcePresentationRequest;
import com.aspose.slides.model.request.PutLayoutSlideRequest;

public class LayoutsExamples {
	LayoutSlidesApi api;

	public LayoutsExamples() {
		api = new LayoutSlidesApi(AppSID, SecretKey);
	}

	
	final static String AppSID = "";
	final static String SecretKey = "";

	private GetLayoutSlideRequest createGetLayoutSlideRequest() {
		GetLayoutSlideRequest request = new GetLayoutSlideRequest();
		request.setName("test.pptx");
		request.setSlideIndex(1);
		return request;
	}

	private GetLayoutSlidesListRequest createGetLayoutSlidesListRequest() {
		GetLayoutSlidesListRequest request = new GetLayoutSlidesListRequest();
		request.setName("test.pptx");

		return request;
	}
	private PostCopyLayoutSlideFromSourcePresentationRequest createPostCopyLayoutSlideFromSourcePresentationRequest() {
        PostCopyLayoutSlideFromSourcePresentationRequest request = new PostCopyLayoutSlideFromSourcePresentationRequest();
        request.setName("test.pptx");
        request.setCloneFrom("test.pptx");
        request.setCloneFromPosition(1);

        return request;
    }
	
	 private PutLayoutSlideRequest createPutLayoutSlideRequest() {
	        PutLayoutSlideRequest request = new PutLayoutSlideRequest();
	        request.setName("test.pptx");
	        request.setSlideIndex(1);
	        LayoutSlide layoutSlide = new LayoutSlide();
            ResourceUriElement uriElement = new ResourceUriElement();
            ResourceUri uri = new ResourceUri();
            uri.setHref("masterSlides/2");
            uriElement.setUri(uri);
            layoutSlide.setMasterSlide(uriElement);
	        request.setSlideDto(layoutSlide);
	        return request;
	    }
	
	public void GetLayoutSlideExample() throws ApiException, Exception {
		LayoutSlideResponse response = null;
		try {
			GetLayoutSlideRequest request = createGetLayoutSlideRequest();
			response = api.getLayoutSlide(request);
			System.out.println(response.getCode());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void GetLayoutSlidesListExample() throws ApiException, Exception {
		LayoutSlideListResponse response = null;
		try {
			GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
			response = api.getLayoutSlidesList(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void PostCopyLayoutSlideFromSourcePresentationExample() throws ApiException, Exception {
        LayoutSlideResponse response = null;;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            response = api.postCopyLayoutSlideFromSourcePresentation(request);
			System.out.println(response.getCode());

        } catch (Exception ex) {
        	ex.printStackTrace();
        }

    }
	
	 public void PutLayoutSlideExample() throws ApiException, Exception {
	        LayoutSlideResponse response = null;;
	        try {
	            PutLayoutSlideRequest request = createPutLayoutSlideRequest();
	            response = api.putLayoutSlide(request);
	            System.out.println(response.getCode());
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws ApiException, Exception {
		new LayoutsExamples().PostCopyLayoutSlideFromSourcePresentationExample();
	}
}
