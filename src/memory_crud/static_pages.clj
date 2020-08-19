(ns memory-crud.static-pages
  (:require [clojure.set :as set]
            [memory-crud.static-pages.home-page :as home-page]
            [memory-crud.static-pages.help :as help]
            [memory-crud.static-pages.about :as about]))

(def routes (set/union home-page/routes
                       about/routes
                       help/routes))

