package pages

import geb.Page
import modules.HeaderModule

class ErrorPage extends Page {

    static at = { errorHeader.text() == ("Error 404") }

    static content = {
        errorHeader { $('#heading') }
        errorSummary { $('#summary') }
        reportLink { $('#github') }

        //top navigation is in the header module
        headerMenu { module(HeaderModule) }
    }
}
