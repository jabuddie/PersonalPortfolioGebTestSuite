package pages

import geb.Page
import modules.HeaderModule

class HomePage extends Page {

    static at = { homeHeader.text().contains("Hello") }
    static url = '/'

    static content = {
        homeHeader { $('#heading') }
        homeSummary { $('#summary') }
        linksTable { $('#exp-links') }
        linkedinUrl { $('#linkedin-url') }
        githubUrl { $('#github-url') }
        badgesUrl { $('#badges-url') }
        istqbUrl { $('#istqb-url') }
        udemyUrl { $('#udemy-url') }

        //top navigation is in the header module
        headerMenu { module(HeaderModule) }
    }

    String checkLink(String linkName) {

        def linkMap = [linkedin: 'https://www.linkedin.com/in/justine-buddie/', github: 'https://github.com/jabuddie',
                       badges  : 'https://www.credly.com/users/justine-buddie/badges', istqb: 'https://atsqa.org/certified-testers/profile/3796b77404a24b1fac65573512adf2f1',
                       udemy  : 'https://www.udemy.com/user/justine-buddie/']

        return linkMap.get(linkName)

    }
}
