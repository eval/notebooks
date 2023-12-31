(ns user
  (:require [nextjournal.clerk :as clerk]
            [advent-of-clerk.index :as index]))

(clerk/serve! {:port 7878 :browse true})

(comment
  (clerk/build! {:paths ["src/notebooks/*"] #_(index/build-paths) :browse true}))
