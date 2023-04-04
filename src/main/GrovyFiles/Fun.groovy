
    def build() {
        echo 'Building'
    }

    def test() {
        echo 'Testing'
    }

    def deploy() {
        echo 'Deploying'
    }

    def getCron(){
        if(isAutomationCheck()) {
             return cron('H 4/* 0 0 1-5')
        }
    }

    def isAutomationCheck(){
        return BRANCH_NAME = 'main'
    }

    return this