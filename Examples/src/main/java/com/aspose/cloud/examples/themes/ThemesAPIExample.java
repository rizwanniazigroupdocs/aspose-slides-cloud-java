package com.aspose.cloud.examples.themes;

import com.aspose.slides.ApiException;
import com.aspose.slides.api.ThemeApi;
import com.aspose.slides.model.ColorSchemeResponse;
import com.aspose.slides.model.FontSchemeResponse;
import com.aspose.slides.model.FormatSchemeResponse;
import com.aspose.slides.model.ThemeResponse;
import com.aspose.slides.model.request.GetSlidesThemeColorSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFontSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFormatSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeRequest;

public class ThemesAPIExample {
	private final ThemeApi api;

	final static String AppSID = "";
	final static String SecretKey = "";

	public ThemesAPIExample() {
		api = new ThemeApi(AppSID, SecretKey);
	}

	private GetSlidesThemeRequest createGetSlidesThemeRequest() {
		GetSlidesThemeRequest request = new GetSlidesThemeRequest();
		request.setName("test.pptx");
		request.setSlideIndex(0);
		return request;
	}

	
	private GetSlidesThemeFormatSchemeRequest createGetSlidesThemeFormatSchemeRequest() {
        GetSlidesThemeFormatSchemeRequest request = new GetSlidesThemeFormatSchemeRequest();
		request.setName("test.pptx");
		request.setSlideIndex(0);
        return request;
    }
	
	
	
	private GetSlidesThemeFontSchemeRequest createGetSlidesThemeFontSchemeRequest() {
		GetSlidesThemeFontSchemeRequest request = new GetSlidesThemeFontSchemeRequest();
		request.setName("test.pptx");
		request.setSlideIndex(0);
		return request;
	}

	private GetSlidesThemeColorSchemeRequest createGetSlidesThemeColorSchemeRequest() {
		GetSlidesThemeColorSchemeRequest request = new GetSlidesThemeColorSchemeRequest();
		request.setName("test.pptx");
		request.setSlideIndex(0);
		return request;
	}

	public void getSlidesThemeTest() throws ApiException, Exception {
		ThemeResponse response = null;
		try {
			GetSlidesThemeRequest request = createGetSlidesThemeRequest();
			response = api.getSlidesTheme(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getSlidesThemeColorSchemeExample() throws ApiException, Exception {
		ColorSchemeResponse response = null;
		try {
			GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
			response = api.getSlidesThemeColorScheme(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void getSlidesThemeFontSchemeExample() throws ApiException, Exception {
		FontSchemeResponse response = null;
		try {
			GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
			response = api.getSlidesThemeFontScheme(request);
			System.out.println(response.getCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public void getSlidesThemeFormatSchemeTest() throws ApiException, Exception {
        FormatSchemeResponse response = null;
        try {
            GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
            response = api.getSlidesThemeFormatScheme(request);
			System.out.println(response.getCode());

        } catch (Exception ex) {
        	ex.printStackTrace();
        }
    }
	

	public static void main(String[] args) {

	}

}
