(ns porkostomus.darkstar-test
  (:require [applied-science.darkstar :as darkstar]))

(comment
  (->> (slurp "exercism.json")
       darkstar/vega-lite-spec->svg
       (spit "exercism.svg")))