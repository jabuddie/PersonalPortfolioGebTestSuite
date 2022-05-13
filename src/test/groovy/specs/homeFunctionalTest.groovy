package specs

import geb.spock.GebSpec
import pages.HomePage
import pages.ErrorPage

class homeFunctionalTest extends GebSpec {

    def "a user can go home"() {

        when:
        to HomePage

        then:
        at HomePage

        when:
        headerMenu.homeBtn.click()

        then:
        at HomePage

    }

    def "a user can navigate to each link"() {

        //github
        when:
        to HomePage
        githubUrl.click()

        then:
        assert currentUrl == checkLink('github')

        //linkedin
        when:
        to HomePage
        linkedinUrl.click()

        then:
        assert currentUrl.contains(checkLink('linkedin'))

        //badges
        when:
        to HomePage
        badgesUrl.click()

        then:
        assert currentUrl == checkLink('badges')

        //istqb
        when:
        to HomePage
        istqbUrl.click()

        then:
        assert currentUrl == checkLink('istqb')

        //udemy
        when:
        to HomePage
        udemyUrl.click()

        then:
        assert currentUrl.contains(checkLink('udemy'))




    }


     def "a bad url results in error page"() {

         when:
         go 'http://justinebuddie.com/bad'

         then:
         at ErrorPage


     }


}
