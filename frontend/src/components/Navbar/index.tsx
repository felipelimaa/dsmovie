import {ReactComponent as GitHubIcon} from 'assets/img/github.svg'
import './styles.css'


function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a 
                        href="https://github.com/felipelimaa"
                        target="_blank"
                        rel="noreferrer"
                    >
                        <div className="dsmovie-contact-container">
                            <GitHubIcon />
                            <p className="dsmovie-contact-link">/felipelimaa</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}

export default Navbar;