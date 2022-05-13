package modules

import geb.Module

class HeaderModule extends Module {

    static content = {
        homeBtn { $('#heading') }
        homeContact { $('#heading') }

    }
}
