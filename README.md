# Notebooks

## Usage

Fork & clone this repo, make sure you have [Clojure
installed](https://clojure.org/guides/install_clojure), then run:

``` shell
clj -M:nextjournal/clerk nextjournal.clerk/serve! --watch-paths src --port 7878 --browse
```

This will start the Clerk webserver on port 7878 and watch the `src/`
directory for changes and open Clerk in your browser.

Open one of the files there, make a change and save
it. You should then see these changes reflected in the browser.
