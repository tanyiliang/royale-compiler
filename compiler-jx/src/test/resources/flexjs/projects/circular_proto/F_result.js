/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Generated by Apache Flex Cross-Compiler from F.as
 * F
 *
 * @fileoverview
 *
 * @suppress {checkTypes|accessControls}
 */

goog.provide('F');

goog.require('D');



/**
 * @constructor
 * @extends {D}
 */
F = function() {
  F.base(this, 'constructor');
};
goog.inherits(F, D);


/**
 * Prevent renaming of class. Needed for reflection.
 */
goog.exportSymbol('F', F);


/**
 * @export
 * @param {boolean} b
 * @return {number}
 */
F.a = function(b) {
  return D.a(false);
};


/**
 * Metadata
 *
 * @type {Object.<string, Array.<Object>>}
 */
F.prototype.FLEXJS_CLASS_INFO = { names: [{ name: 'F', qName: 'F', kind: 'class' }] };



/**
 * Reflection
 *
 * @return {Object.<string, Function>}
 */
F.prototype.FLEXJS_REFLECTION_INFO = function () {
  return {
    variables: function () {return {};},
    accessors: function () {return {};},
    methods: function () {
      return {
        'F': { type: '', declaredBy: 'F'},
        '|a': { type: 'int', declaredBy: 'F', parameters: function () { return [  { index: 1, type: 'Boolean', optional: false } ]; }}
      };
    }
  };
};
