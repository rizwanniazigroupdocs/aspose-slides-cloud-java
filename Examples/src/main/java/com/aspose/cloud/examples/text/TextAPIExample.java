package com.aspose.cloud.examples.text;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.TextApi;
import com.aspose.slides.model.PresentationStringReplaceResponse;
import com.aspose.slides.model.SlideStringReplaceResponse;
import com.aspose.slides.model.TextItemsResponse;
import com.aspose.slides.model.request.GetSlidesPresentationTextItemsRequest;
import com.aspose.slides.model.request.GetSlidesSlideTextItemsRequest;
import com.aspose.slides.model.request.PostSlidesPresentationReplaceTextRequest;
import com.aspose.slides.model.request.PostSlidesSlideReplaceTextRequest;

public class TextAPIExample {

	private final TextApi api;

	final static String AppSID = "";
	final static String SecretKey = "";

	public TextAPIExample() {
		api = new TextApi(AppSID, SecretKey);
	}

	
	private GetSlidesPresentationTextItemsRequest createGetSlidesPresentationTextItemsRequest() {
        GetSlidesPresentationTextItemsRequest request = new GetSlidesPresentationTextItemsRequest();
		request.setName("test.pptx");
        request.setWithEmpty(true);
        return request;
    }
	

    private GetSlidesSlideTextItemsRequest createGetSlidesSlideTextItemsRequest() {
        GetSlidesSlideTextItemsRequest request = new GetSlidesSlideTextItemsRequest();
		request.setName("test.pptx");
        request.setSlideIndex(1);
        request.setWithEmpty(true);
        return request;
    }
	
    
    private PostSlidesPresentationReplaceTextRequest createPostSlidesPresentationReplaceTextRequest() {
        PostSlidesPresentationReplaceTextRequest request = new PostSlidesPresentationReplaceTextRequest();
        request.setName("test.pptx");       
        request.setOldValue("hello");
        request.setNewValue("world");
        request.setIgnoreCase(true);
        return request;
    }
    
    private PostSlidesSlideReplaceTextRequest createPostSlidesSlideReplaceTextRequest() {
        PostSlidesSlideReplaceTextRequest request = new PostSlidesSlideReplaceTextRequest();
        request.setSlideIndex(0);
        request.setName("test.pptx");       
        request.setOldValue("hello");
        request.setNewValue("world");
        request.setIgnoreCase(true);
        return request;
    }
	
	public void getSlidesPresentationTextItemsTest() throws ApiException, Exception {
		TextItemsResponse response = null;
		try {
			GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
			response = api.getSlidesPresentationTextItems(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public void getSlidesSlideTextItemsTest() throws ApiException, Exception {
        TextItemsResponse response = null;
        try {
            GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
            response = api.getSlidesSlideTextItems(request);
            System.out.println(response.getCode());
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
    }
	
	
	
	
	public void postSlidesPresentationReplaceTextTest() throws ApiException, Exception {
        PresentationStringReplaceResponse response = null;;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();                      
            response = api.postSlidesPresentationReplaceText(request);
            System.out.println(response.getCode());
        } catch (Exception ex) {
        	ex.printStackTrace();
        }

    }
	

	public void postSlidesSlideReplaceTextTest() throws ApiException, Exception {
        SlideStringReplaceResponse response = null;;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            response = api.postSlidesSlideReplaceText(request);
            System.out.println(response.getCode());
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
    }
	public static void main(String[] args) {

	}

}
