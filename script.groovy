def build() {
    echo 'building the application'
}
def test() {
    echo 'testing the application'
    echo "Branch name $BRANCH_NAME"
}
def deploy() {
    echo 'deploying the application'
    echo "Deploying version ${params.VERSION}"
}

return this
