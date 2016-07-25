/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is "Simplenlg".
 *
 * The Initial Developer of the Original Code is Ehud Reiter, Albert Gatt and Dave Westwater.
 * Portions created by Ehud Reiter, Albert Gatt and Dave Westwater are Copyright (C) 2010-11 The University of Aberdeen. All Rights Reserved.
 *
 * Contributor(s): Ehud Reiter, Albert Gatt, Dave Wewstwater, Roman Kutlak, Margaret Mitchell, Pierre-Luc Vaudry.
 */

package simplenlg.features.italian;

/**
 * Extension of the internal features constants for Italian.
 * 
 * @author Cristina Battaglino
 *
 */
public abstract class ItalianInternalFeature {

	/**
	 * <p>
	 * This features determines if a pronominal verb complement phrase is a clitic. Clitic
	 * phrases are realised before the verb instead of behind it. The verb phrase syntax
	 * helper methods determine the exact position.
	 * </p>
	 * <table border="1">
	 * <tr>
	 * <td><b>Feature name</b></td>
	 * <td><em>clitic</em></td>
	 * </tr>
	 * <tr>
	 * <td><b>Expected type</b></td>
	 * <td><code>Boolean</code></td>
	 * </tr>
	 * <tr>
	 * <td><b>Created by</b></td>
	 * <td>The verb phrase syntax helper methods set this flag on pronominal verb complement
	 * phrases.</td>
	 * </tr>
	 * <tr>
	 * <td><b>Used by</b></td>
	 * <td>The verb phrase syntax helper methods to correctly place pronominal verb
	 * complements.</td>
	 * </tr>
	 * <tr>
	 * <td><b>Applies to</b></td>
	 * <td>Pronominal verb complement phrases.</td>
	 * </tr>
	 * <tr>
	 * <td><b>Default</b></td>
	 * <td><code>Boolean.FALSE</code></td>
	 * </tr>
	 * </table>
	 */
	public static final String CLITIC = "clitic";

	/**
	 * <p>
	 * This features indicates that the phrase is replaced by a relative pronoun
	 * somewhere and that therefore it must not be realised. It is only used with
	 * preposition phrases, as the relative clause may not be their parent.
	 * </p>
	 * <table border="1">
	 * <tr>
	 * <td><b>Feature name</b></td>
	 * <td><em>relativised</em></td>
	 * </tr>
	 * <tr>
	 * <td><b>Expected type</b></td>
	 * <td><code>Boolean</code></td>
	 * </tr>
	 * <tr>
	 * <td><b>Created by</b></td>
	 * <td>The clause syntax helper methods set this flag on relative phrases that are
	 * preposition phrases.</td>
	 * </tr>
	 * <tr>
	 * <td><b>Used by</b></td>
	 * <td>The generic phrase syntax helper methods to determine if a phrase must
	 * be realised.</td>
	 * </tr>
	 * <tr>
	 * <td><b>Applies to</b></td>
	 * <td>Preposition phrases.</td>
	 * </tr>
	 * <tr>
	 * <td><b>Default</b></td>
	 * <td><code>Boolean.FALSE</code></td>
	 * </tr>
	 * </table>
	 */
	public static final String RELATIVISED = "relativised";

}